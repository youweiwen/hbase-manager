package com.leo.hbase.manager.system.service;

import java.util.List;

import com.leo.hbase.manager.system.domain.SysHbaseNamespace;

/**
 * HBaseNamespaceService接口
 *
 * @author leojie
 * @date 2020-08-16
 */
public interface ISysHbaseNamespaceService {
    /**
     * 查询HBaseNamespace
     *
     * @param namespaceId HBaseNamespaceID
     * @return HBaseNamespace
     */
    public SysHbaseNamespace selectSysHbaseNamespaceById(Long namespaceId);

    /**
     * 查询HBaseNamespace列表
     *
     * @param sysHbaseNamespace HBaseNamespace
     * @return HBaseNamespace集合
     */
    public List<SysHbaseNamespace> selectSysHbaseNamespaceList(SysHbaseNamespace sysHbaseNamespace);

    /**
     * 根据名称查询HBase的namespace
     *
     * @param namespaceName namespace name
     * @return HBaseNamespace
     */
    public SysHbaseNamespace selectSysHbaseNamespaceByName(String namespaceName);

    /**
     * 查询所有HBaseNamespace列表
     *
     * @return HBaseNamespace集合
     */
    public List<SysHbaseNamespace> selectAllSysHbaseNamespaceList();

    /**
     * 新增HBaseNamespace
     *
     * @param sysHbaseNamespace HBaseNamespace
     * @return 结果
     */
    public int insertSysHbaseNamespace(SysHbaseNamespace sysHbaseNamespace);

    /**
     * 修改HBaseNamespace
     *
     * @param sysHbaseNamespace HBaseNamespace
     * @return 结果
     */
    public int updateSysHbaseNamespace(SysHbaseNamespace sysHbaseNamespace);

    /**
     * 批量删除HBaseNamespace
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysHbaseNamespaceByIds(String ids);

    /**
     * 删除HBaseNamespace信息
     *
     * @param namespaceId HBaseNamespaceID
     * @return 结果
     */
    public int deleteSysHbaseNamespaceById(Long namespaceId);
}