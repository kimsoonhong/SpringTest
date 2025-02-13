/*
 * package com.shong.spring.test.database;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.ResponseBody;
 * 
 * import com.shong.spring.test.database.domain.UsedGoods; import
 * com.shong.spring.test.database.service.UsedGoodsService;
 * 
 * //request, response 처리 만 담당.
 * 
 * @Controller public class UsedGoodsController {
 * 
 * @Autowired private UsedGoodsService usedGoodsService;
 * 
 * // uesd_goods 태이블의 모든 행을 response에 담는다.
 * 
 * @ResponseBody
 * 
 * @RequestMapping("/db/usedgoods/list") public List<UsedGoods> usedGoodsList()
 * { // 중고물품 게시슬 정보얻어오기 List<UsedGoods> usedGoodsList =
 * usedGoodsService.getUsedGoodList();
 * 
 * return usedGoodsList;
 * 
 * }
 * 
 * }
 */