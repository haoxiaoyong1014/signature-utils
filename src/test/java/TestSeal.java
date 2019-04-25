import com.niezhiliang.signature.utils.basic.AbstractBasicSeal;
import com.niezhiliang.signature.utils.entity.ColorEnum;
import com.niezhiliang.signature.utils.entity.FontEnum;
import com.niezhiliang.signature.utils.entity.SealInfo;
import com.niezhiliang.signature.utils.factory.ComplesSealFactory;
import com.niezhiliang.signature.utils.factory.SimpleSealFactory;
import com.niezhiliang.signature.utils.factory.StartedSealFactory;
import org.junit.Test;

/**
 * Created by Haoxy on 2019-04-24.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public class TestSeal {

    /*@Test
    public void test1() throws Exception {
        String base64 = SealUtils.companyCircleSeal("浙江杭州江干下沙某某某网络集团有限公司", ColorEnum.RED, FontEnum.FANGZHENGHEITI, "1234567899876", "合同专用");
        System.out.println(base64);
    }

    @Test
    public void test2() throws Exception {
        String base64 = SealUtils.companyEllipseSeal("浙江某某某网络集团有限公司", ColorEnum.RED, FontEnum.SONGTI, "1234567899876", "神域专用");
        System.out.println(base64);
    }*/
                /**-------------------------------------------------**/
                /**------------------华丽的分割线--------------------**/
                /**-------------------入门级------------------------**/


    @Test
    public void testStartedFactoryCircle() {
        AbstractBasicSeal seal = new StartedSealFactory().newInstance();
        SealInfo sealInfo = new SealInfo("浙江某某某网络集团有限公司", ColorEnum.RED, FontEnum.SONGTI);
        String baseStr = seal.drawCircle(sealInfo);
        System.out.println(baseStr);
    }

    @Test
    public void testStartedFactoryEllipse() {
        AbstractBasicSeal seal = new StartedSealFactory().newInstance();
        SealInfo sealInfo = new SealInfo("浙江某某某网络集团有限公司", ColorEnum.RED, FontEnum.SONGTI, "合同专用");
        String baseStr = seal.drawEllipse(sealInfo);
        System.out.println(baseStr);
    }
                /**-------------------------------------------------**/
                /**------------------华丽丽的分割线--------------------**/
                /**-------------------简单级-------------------------**/

    @Test
    public void testSimpleFactoryCircle() {
        AbstractBasicSeal seal = new SimpleSealFactory().newInstance();
        SealInfo sealInfo = new SealInfo("浙江某某某网络集团有限公司", ColorEnum.RED, FontEnum.SONGTI, "合同专用");
        String baseStr = seal.drawCircle(sealInfo);
        System.out.println(baseStr);
    }

    @Test
    public void testSimpleFactoryEllipse() {
        AbstractBasicSeal seal = new SimpleSealFactory().newInstance();
        SealInfo sealInfo = new SealInfo("浙江某某某网络集团有限公司", ColorEnum.RED, FontEnum.SONGTI, "合同专用", "35679015");
        String baseStr = seal.drawEllipse(sealInfo);
        System.out.println(baseStr);
    }

            /**-------------------------------------------------**/
            /**------------------华华丽丽的分割线------------------**/
            /**--------------------复杂级-------------------------**/

    @Test
    public void testComplexFactoryCircle(){
        AbstractBasicSeal seal = new ComplesSealFactory().newInstance();
        SealInfo sealInfo = new SealInfo("浙江某某某网络集团有限公司", ColorEnum.RED, FontEnum.SONGTI, "合同专用", "135679015");
        String baseStr = seal.drawCircle(sealInfo);
        System.out.println(baseStr);
    }

    @Test
    public void testComplexFactoryEllipse(){
        AbstractBasicSeal seal = new ComplesSealFactory().newInstance();
        SealInfo sealInfo = new SealInfo("浙江某某某网络集团有限公司", ColorEnum.RED, FontEnum.SONGTI, "合同专用章", "135679015");
        String baseStr = seal.drawEllipse(sealInfo);
        System.out.println(baseStr);
    }

}
