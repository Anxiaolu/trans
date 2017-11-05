/*
 * file_name: UserOpsTest.java
 *
 * Copyright GaoYisheng Corporation 2017
 *
 * License：
 * date： 2017年11月2日 下午9:43:07
 *       https://www.gaoyisheng.site
 *       https://github.com/timo1160139211
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.test.base;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import site.gaoyisheng.pojo.Thesis;
import site.gaoyisheng.pojo.User;
import site.gaoyisheng.service.ThesisService;
import site.gaoyisheng.service.UserService;

public class UserOpsTest extends BaseTest {

	@Autowired
	private ThesisService ts;
	
	@Autowired
	private UserService us;

/*	@Test
	public void loginTest() {

		User user = new User();
		user.setName("陈鹏");
		user.setNumber("123");
		
		List<Thesis> thesisList = ts.selectAllThesisLikeUserNameAndNumber(user);

//		List<Thesis> thesisList = ts.selectAllThesis();
		
		for (Thesis t : thesisList) {
			System.out.println(t.toString());

		}
	}
*/
	
/*	@Test
	public void updateTest() {
		Thesis thesis = new Thesis();

		//注掉此行 将没有数据被更新:
//		thesis.setId(3);
		thesis.setName("haha");
		thesis.setNo10AutherName("haha2");
		
		ts.updateByPrimaryKeySelective(thesis);
	}
*/
	@Test
	public void selectTest() {
//		List<User> userList = us.selectAllUser();
//		for (User u : userList) {
//			System.out.println(u.toString());
//
//		}
	}	
	
//	@Test
//	public void insertListTest() {
//		List<Thesis> thesisList = new ArrayList<Thesis>();
//		
//		Thesis t1 = new Thesis();
//		Thesis t2 = new Thesis();
//		Thesis t3 = new Thesis();
//		
//		t1.setName("qq1");
//		t2.setName("ww2");
//		t3.setName("asd");
//		
//		thesisList.add(t1);
//		thesisList.add(t2);
//		thesisList.add(t3);
//		
//		try {
//			System.out.println(ts.insertList(thesisList));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}
