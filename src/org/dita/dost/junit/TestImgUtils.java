package org.dita.dost.junit;
import static org.junit.Assert.assertEquals;

import java.io.File;

import org.dita.dost.util.ImgUtils;


import org.junit.Test;



public class TestImgUtils {
	
	@Test
	public void testgetwidth()
	{
		
		assertEquals(95,(ImgUtils.getWidth("test-stub" + File.separator, "img.jpg")));
		
	}
	
	@Test
	public void testgetheight()
	{
		assertEquals(135,(ImgUtils.getHeight("test-stub" + File.separator, "img.jpg")));
	}

	
	@Test
	public void testgetbindata()
	{
		assertEquals("ffd8ffe000104a46494600010101006400640000ffdb0043000604040405040605050609060506090b080606080b0c0a0a0b0a0a0c100c0c0c0c0c0c100c0e0f100f0e0c1313141413131c1b1b1b1c20202020202020202020ffdb0043010707070d0c0d181010181a1511151a20202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020ffc0001108005f008703011100021101031101ffc4001d000000070101010000000000000000000000030405060708020109ffc4004210000102030505040509060700000000000102030004110506122131071322416123325171148191a1b108425262728292c1d11516243353e134353773a2b2c2ffc400190100030101010000000000000000000000000102030405ffc400261101000202020201040203000000000000000102031121310412411422617132511342b1ffda000c03010002110311003f00d51121ec5040f6d77f05ccb853d6834aa5a333fc2d9c39ef9dcabf753554053cf0c55e9ac29a4874ef144952ebf395e2a3ce8738cb4d7643372e84a4292778f3a787a9f1f21149936bcd61e106b4c8f5301084b0e1a75d22b61d6157751af487b1a1ae4bbcc385a7d250e8ef20e44573106c4c3a46a0c00e32dc591192b23f940658da428a4934246157da4c1b078959b765d4c4e327038939286a14987512d9fb31bdc9bd174a527d4bc538d8dcce0e7bd48d7ef0ce14a52b80040020011202283227cadef7ae76f7c9580d2ff86b1d80f389e4662634af920089b0aff6a090f9c5ae9afc6119e64e71b4a8ef337424e351ff008a47801a984a7134ec8a1a416ce35927879f9c3293bdd8bbb6a5e69f6e46418e250abaf532423c7a08cef922ad71629b7e976dced88d8b64253685a83d254c853a10a1c2023991cc9ce392d92d675c56b5e941de47573d782d19d50ce65f79c03a151a7ba3bb1f4e1c9d90a11a7ae34415ca8aa922bde1ef1c42102ce109730fd550f81f8c06719601528ac5904ac11f78670fe4fe17efc982de48767ec652b3751e908cf5c040f82a2eccfe5a0e20c20010079101ec5407cebda8dbcbb72fedb769a8d44cce3cb4fd842b76d8fc29893455a345575a1ac3112331a857aebe6a801eec1b0d73cf052d24848a914cfa01d4c6197269d3870fb359ecb2e34bddfbbe82a6e93b3612b985919814e147aa39239e5d39275c424d79925360cfeef250975e1f309247be2add33a76c8178acedccead1870e065b2a1f701f8c7562b70c3c8aea4c0909c8f5ca37738e6b22de11905e70cce61bcdca77435f03fda2545528957ece51a65bc47e70f7c8f858fb029d54aed064d293843ae29a35e695a4feb1bcf4ca5aea315040020029a5e2158804179ed0167ddbb567c9c225651f7abf61b27f28a80f9b132e29c9871c566a5185072e508d091c275808bec7b1e7ad7b41b93946f78eb86b4f01d622f78ac6e5a63c7369e17f6ccee02516f2d1329ec2cddd2549229bc98c295d4f96227d91e75edecf4ff8c2fe64242001ca3587288b518df483ed7f55051f8b28568e1559e5932fe4ba25ed978572725dba1ea8ecff00f31af8f3c17971ca18d327081a9fd23adc4edb696a0da473a9f841b3d1f4cb9097d7dda358403f58988dae207b4de1b3d84e85d7454744b67f58a8ec4c7097ec6317efb48bc3bc998453cb1c744f4c9b263201000801348ff2ab135394736ace96b67378d40d0990780e7aa690c9f3b5de17940e4214747294c95d99c72ec5a36f05ff000b22584392fcc8983c255f56bac65eff00769b7a4c576be3607772eeb964aa7e5db06795d9ccd684b6a4d2ad83e19d7ac71e4dcdf52eaacc45784ed577584db169a77aa650b2d3f85070f7db08272ff6e33b469716e0d168de0b997611e9168bb3a258af76e4e053a580e1d115ae1c469a455376e8ad3aef5096d9b6ad8b6bd941fb2e777cc382a9712aa91ce1fb234cf3b5db20b16cceb98b1005184f43534fc51a78f6f82f2238dabe91014e239e254764b8ea529668b4019a9209a0eaaa42da8e73dc18dbd5470a0f9d2b0972e9e5610c26a3b3055ee87052976c7c2ff7aa4377df0f2567eca3331ac4b298d4363c09080040086494528f1880876db26d6d6cead308242dfc0ca70fd7553d9e30c982a6a5b7939b91aa97bb07cd586174bee5b06ee6cf2c393b2d4d6e7b39b6c37372e7369c4d00c2b468748f22b333cbd4b4c7492dd3bb36358ce3ccd9326d4930a38dc6d94e105669c47ad131b53732c6dd1de76cd132a52d2ac0e1416f174d47b0c1929b2adf4816d1ae25a3792efc8594cd25dfb2e684cc9be9cd9570a90a0e235ad15504738bc797d783c948b4ef66dd9d6c9a7eed6f8bd3aea9d75c5bae169452d2b1d289dd12b1c34d75a988cb6f795d3d695d77262db9d80199254d8e2c4d1513f592a1f9418bedb95feea4fe1464939870d723424799a523d0979f07290ed2d05a4f71000f5d6b584b1aecc071c4affa8a539ea2689f741a132f599a694f62268549ecebd4c2bc4aa92b0363ee21eda0598ca28aa12174f0222f0c4a33f4d7c348b661000801ae55eaa2202bfdba4eb48ba419510378a2a15aea84920e5e0748098b1f3827a59ca5015a155f255614f4b8edb8a4538e55b239a41f7479748e1e95fb3bc8b296d852b9ab331d148e1848d0b490473841c52a6254f70406a9be50136d3176b0eaa7838d8f5810a23778547f0966443bc47a5047a2f3cea83ba65409a3af9c35fb5fdb384a73bd4a958126892295f0481fa4346c95f7f8979104f0a127c0733141636c254a46d22cc4815a0c4a55694033af58d28cf24f0da022161000801ad9484233849555b779869762997af186cad3ed093edc5112a86449e6d25c69a7320178491f455e10c4b5e6caaf1a6deb8965cf62abdb80c3fd1d67b35fbc563cd98f59987a3bdc44a64dda92e1b2dab162d3080498b8bc27d5d1792e2d3bacebae4442993d0e6d6743ac06f5c740115b267bf947dbcdd64acc4aaae514f3bd06898305776d8cd6d53f6a3645a539309c5cb8d5e51db2e082f9974e319f74667c316bec10c4c92fa466a5695d3a08642d2ea9e7b78baa947c4d4c505a3b05ff0052e490a4571a777a5684ebeeac694659be3f6da319b508004010b6af0b330809616178bc0c56b865ecab36db32e6e941606154ba92147c71a15f01116c6d2b765f9f5d5f4e784a4d2bebd626152b53e4eb7d1b94b526aeb4e3bba62d03bfb395e0f8145a3efa454794727934ff00674f8f7f868696bc565b6fb92d3abf46799500a53bdc565914ab4e71cb178f976fd35a6371cc1e58b46ca7918a5a6d9707d47127f38da26258da968ee24589d9471f521a585ad238b09a889dc168dd6d5aed494ab930eab0b6d24a944f488b59711b644bf178d778af14cda4aaada5288681f9c94f769d23b70d750e5f22fb935360ca37c7fcf728563c3e8a7df531b302675da829ae55ccf898a49229ef0d39f5e91407d9ea3bcc6af38242def93a76bb4a94aab0a4e370d79eed2683da62ab29c91ff5b2225410008028ab992fe833219af67ca2a92c2d5d235b6eb451b8a2493bc42d0453874a7b6b9c6996782c5ccb395a0938fae79472baa49659e7e5e61a9b965144d4b2d2f32a1a85b66a3e10f5b8d144e9b5ac3f42bcd60c85aec9ff001d2edbd5e5c49cc1f2394795e8f531e79af47496bb8ca5385544a0f792900562a28abf93693886996190d3490948d008a973ef6cedb6fda209eb40dd7b15cde211fe65309d0abfa40f80f9c7d51a61c7bfba539326b885692d26db6da9c3c787877879afc07d9fed1d16b39e205a90d120d0015e12a153d4c67ecbd09526550d3fbc97439bc46142ea4141af7a9ce2eb919df16ff08f3895ef30af96823a2276ce60a9a529235cf4861686c56d04d957ba427566890e86d64fd15f7a33f6e5b4537596d865c4b8d25c49aa542a3d71a3087701840146592bc3348855ed9d9566d6e69d54b32a2aa25c2b5d3c45683feb0f248c30a9679399a8eee1f8c66d88d52e5aab87200fc6192fdf93b6d2acb97957ae7dad348979865c2e590b7484a5c6d79a990a39624aaa40e60f48e5cd8f5cba70df71a5f0fda32ec35bc75610819e251a0a79c61eedbd148ed476d12efcbcd58f7667029cfe54c4fb26b4fa410bf1f2f745531cda79e8a6f158fca946d80ca0a94774dab896a39ad5e663b5c723a6a64a659bca8809ecdbd28078c651db4f87921675a33e80a9565c9851eeee90a57c348c6f922ad6b5993dc96ccefb4d0c7e80586b42b7481ee15319dbc8aae3149c57b1c9966543d34f637c020e01c3a575e70e3cb1f4dfda036ad96b92b412c5284d0fb447763bfb4397263f59482cf7bd11966870aabbca8d72d223e5b750d7bb1ebe1fb6eee32ccc2ab392e3028939abc0c6f12e5b5752b0219040141b4fee92e3df41b5abd8930a116541b5098c6a93679b6d00afc23f32626f2d290afcb3bd9f6db57714a4d7cab08c5de0ec65377f3d6f149f26f28a8498e6b0b84aa9ad2283a69db4e6ca659536f2dbd0216e2ca40fb24c4ea0f7291d9cd36da1b6594e5a201e67c4c44cae213097d9ddbb3922bb41e704bcbd12a4ac615b8bc470a401501152630fa8ab7fa6958376f61961cd30dbb68cccc55b094d0e02d1573c9242a9eb8c7fcb13f857a7afe53f62ea48dda6a5da7d80cc8bab0dcacd32b52da2b56412a6cf6883ea23ac6593c4f9ed75f23e0fab924b08285369535a28463e9a57b19ed46644bcc4bd3b37094014e9887c22a8ae59df69365fa1de96da0016d58dc6d5e292e6115f28edc1d31cdccc23732e1c6ef2404230fb63a22185a5766c12dd71bb483493c2bc8f98cc1875e2c3273569f6d61684a868a158d583a803ffd9",ImgUtils.getBinData("test-stub" + File.separator, "img.jpg"));
	}
	
	@Test
	public void testgettype()
	{
		assertEquals("jpegblip",ImgUtils.getType("img.jpg"));
		assertEquals("jpegblip",ImgUtils.getType("img.jpeg"));
		assertEquals("pngblip",ImgUtils.getType("img.gif"));
		assertEquals("pngblip",ImgUtils.getType("img.png"));
		assertEquals("other",ImgUtils.getType("img.JJJ"));
	}
}
