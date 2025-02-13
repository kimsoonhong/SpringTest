/*
 * package com.shong.spring.test.database.service;
 * 
 * import java.util.List;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.shong.spring.test.database.domain.UsedGoods; import
 * com.shong.spring.test.database.repository.UsedGoodsRepository;
 * 
 * // 로직(비지니스) 담당 // 데이터를 가공한다 // 그외 복잡한 기능 수행 // 컨트롤로에서 필요한 기능을 수행한다~
 * 
 * @Service public class UsedGoodsService {
 * 
 * // 해당 멤버번수에 sprig이 자동으로 객체를 생성해서 <주입>해준다.
 * 
 * @Autowired private UsedGoodsRepository usedgoodsRepository;
 * 
 * // 중고물품 게시를 모두 얻어오기 public List<UsedGoods> getUsedGoodList() {
 * 
 * // used_goods 테이블 모든 행 조회 List<UsedGoods> usedGoodsList =
 * usedgoodsRepository.selectUsedGoodsList();
 * 
 * // 데이터 가공 가정 return usedGoodsList; }
 * 
 * }
 */