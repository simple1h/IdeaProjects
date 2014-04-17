package TestEJBProject;

import javax.ejb.Remote;

/**
 * Created with IntelliJ IDEA.
 * User: Simple
 * Date: 09.04.14
 * Time: 22:16
 * To change this template use File | Settings | File Templates.
 */
@Remote
public interface TestBeanRemote
{
    String getMessage();
}
