package com.clovexmu.ctf.demo.utils;

import java.io.Serializable;
import java.util.List;

/**
 * 功能描述：分页对象
 * <p>包含数据信息、每页条数、当前页数、总条数等信息</p>
 *
 * @author: Zhenbin.Li
 * email： lizhenbin@oneplus.cn
 * company：一加科技
 * Date: 15/9/9 Time: 10:03
 */
public interface Paging<T> extends Serializable, Iterable<T> {

    /**
     * 当前页包含的数据
     *
     * @return 当前页数据源
     */
    public List<T> getResult();

    /**
     * 是否是首页（第一页），第一页页码为1
     *
     * @return 首页标识
     */
    public boolean isFirstPage();

    /**
     * 是否是最后一页
     *
     * @return 末页标识
     */
    public boolean isLastPage();

    /**
     * 是否有下一页
     *
     * @return 下一页标识
     */
    public boolean hasNextPage();

    /**
     * 是否有上一页
     *
     * @return 上一页标识
     */
    public boolean hasPreviousPage();

    /**
     * 获取最后一页页码，也就是总页数
     *
     * @return 最后一页页码
     */
    public int getLastPageNo();

    /**
     * 总的数据条目数量，0表示没有数据
     *
     * @return 总数量
     */
    public int getTotalCount();

    /**
     * 获取当前页的首条数据的行编码
     *
     * @return 当前页的首条数据的行编码
     */
    public int getCurrentPageFirstElementNo();

    /**
     * 获取当前页的末条数据的行编码
     *
     * @return 当前页的末条数据的行编码
     */
    public int getCurrentPageLastElementNo();

    /**
     * 获取下一页编码
     *
     * @return 下一页编码
     */
    public int getNextPageNo();

    /**
     * 获取上一页编码
     *
     * @return 上一页编码
     */
    public int getPreviousPageNo();

    /**
     * 每一页显示的条目数
     *
     * @return 每一页显示的条目数
     */
    public int getPageSize();

    /**
     * 当前页的页码
     *
     * @return 当前页的页码
     */
    public int getCurrentPageNo();
}
