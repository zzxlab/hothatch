package com.hiersun.adapter.dao;

import com.hiersun.adapter.entity.TxInfo;
import com.hiersun.adapter.example.TxInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TxInfoMapper {
    long countByExample(TxInfoExample example);

    int deleteByExample(TxInfoExample example);

    int insert(TxInfo record);

    int insertSelective(TxInfo record);

    List<TxInfo> selectByExample(TxInfoExample example);

    int updateByExampleSelective(@Param("record") TxInfo record, @Param("example") TxInfoExample example);

    int updateByExample(@Param("record") TxInfo record, @Param("example") TxInfoExample example);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table tx_info
     *
     * @mbg.generated
     * @author hewei
     */
    TxInfo selectOneByExample(TxInfoExample example);
}