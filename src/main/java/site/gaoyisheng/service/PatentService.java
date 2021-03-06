/*
 * file_name: PatentService.java
 *
 * Copyright GaoYisheng Corporation 2017
 *
 * License：
 * date： 2017年11月15日 下午9:36:21
 *       https://www.gaoyisheng.site
 *       https://github.com/timo1160139211
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package site.gaoyisheng.service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.gaoyisheng.dao.PatentMapper;
import site.gaoyisheng.pojo.EnPeriodicalThesis;
import site.gaoyisheng.pojo.Patent;
import site.gaoyisheng.utils.FileUtil;

@Service
public class PatentService {

	@Autowired
	private PatentMapper patentDao;

	/**
	 * .
	 * TODO 查询所有
	 * @return
	 */
	public List<Patent> selectAll() {
		return patentDao.selectAll();
	}

	/**
	 * .
	 * TODO 通过认领状态查询
	 * @param status
	 * @return
	 */
	public List<Patent> selectByStatus(String status) {
		return patentDao.selectByStatus(status);
	}

	/**
	 * .
	 * TODO  通过认领状态查询,+分页参数:重载
	 * @param status
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public List<Patent> selectByStatus(String claimStatus,int pageNum,int pageSize) {
		return patentDao.selectByStatus(claimStatus,pageNum,pageSize);
	}
	
	/**
	 * . 
	 * TODO 统计: "已认领"="claimed"  ,"notClaimed"="未认领"  ,总数="total"
	 * 
	 * @return
	 */
	public Map<String, Integer> selectStatistic() {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("claimed", patentDao.selectCountByStatus("已认领"));
		map.put("notClaimed", patentDao.selectCountByStatus("未认领"));
		map.put("total", patentDao.selectCount());

		return map;
	}

	/**
	 * .
	 * TODO 主键查询
	 * @param patentId
	 * @return
	 */
	public Patent selectByPrimaryKey(Integer patentId) {
		return patentDao.selectByPrimaryKey(patentId);
	}
	
	/**
	 * 
	 * .
	 * TODO 唯一
	 * @param patentId
	 * @return
	 */
	public Patent selectByUniqueKey(Integer patentId) {
		return patentDao.selectByPrimaryKey(patentId);
	}

	/**
	 * 
	 * .
	 * TODO 多条件查询
	 * @param map
	 * @return
	 */
	public List<Patent> selectByMultiConditions(Map<String, String> map) {
		return patentDao.selectByMultiConditions(map);
	}
	
	/**
	 * .
	 * TODO 多条件查询 +分页参数:重载
	 * @param map
	 * @return
	 */
	public List<Patent> selectByMultiConditions(Map<String, String> map,int pageNum,int pageSize) {
		return patentDao.selectByMultiConditions(map,pageNum,pageSize);
	}

	/**
	 * .
	 * TODO 通过主键更新.(值为  null , '' 的字段将不被更新)
	 * @param p
	 * @return
	 */
	public int updateByPrimaryKeySelective(Patent p) {
		return patentDao.updateByPrimaryKeySelective(p);
	}
	
	/**
	 * .
	 * TODO 将数据流读取并批量插入
	 * @param in
	 * @return
	 * @throws Exception
	 */
	public int readStreamAndInsertList(InputStream in) throws Exception {
		FileUtil fileUtil = new FileUtil();
		List<Patent> patentList = fileUtil.importFileOfPatent(in);
		return patentDao.insertList(patentList);
	}

	/**
	 * .
	 * TODO 批量插入
	 * @param patentList
	 * @return
	 * @throws Exception
	 */
	public int insertList(List<Patent> patentList) throws Exception {
		return patentDao.insertList(patentList);
	}
}
