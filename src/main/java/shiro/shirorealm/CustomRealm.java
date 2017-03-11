package shiro.shirorealm;

import entity.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import service.ShiroUserService;

/**
 * Created by xuweijie on 2017/3/3.
 */
public class CustomRealm extends AuthorizingRealm{

    @Autowired
    private ShiroUserService userService;

    //设置realm的名称
    @Override
    public void setName(String name) {
        super.setName("customRealm");
    }

    //登录认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        String username= (String) authenticationToken.getPrincipal();
        User user= null;

        user = userService.queryUser(username);

        if(userService==null){
            return null;
        }
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(username,user.getPassword(),
                ByteSource.Util.bytes(user.getSalt()),this.getName());
        return simpleAuthenticationInfo;
    }

    //授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
}
