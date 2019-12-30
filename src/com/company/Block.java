package com.company;


public class Block {

    private String blockhash;


    private String blocksize;


    private String nversion;



    private String hashprevblock;


    private String hashmerkleroot;


    private String hashmerklestate;


    private String hashmerkleincubate;

    private String nheight;


    private String ntime;


    private String nbits;

    private String nnonce;


    private String blocknotice;


    private String remarks;

    /**
     * 状态
     */
    private String status;

    /**
     * 获取主键
     *
     * @return blockHash - 主键
     */
    public String getBlockhash() {
        return blockhash;
    }

    /**
     * 设置主键
     *
     * @param blockhash 主键
     */
    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    /**
     * 获取区块大小
     *
     * @return blockSize - 区块大小
     */
    public String getBlocksize() {
        return blocksize;
    }

    /**
     * 设置区块大小
     *
     * @param blocksize 区块大小
     */
    public void setBlocksize(String blocksize) {
        this.blocksize = blocksize;
    }

    /**
     * 获取版本
     *
     * @return nVersion - 版本
     */
    public String getNversion() {
        return nversion;
    }

    /**
     * 设置版本
     *
     * @param nversion 版本
     */
    public void setNversion(String nversion) {
        this.nversion = nversion;
    }

    /**
     * 获取上一个区块
     *
     * @return hashPrevBlock - 上一个区块
     */
    public String getHashprevblock() {
        return hashprevblock;
    }

    /**
     * 设置上一个区块
     *
     * @param hashprevblock 上一个区块
     */
    public void setHashprevblock(String hashprevblock) {
        this.hashprevblock = hashprevblock;
    }

    /**
     * 获取根
     *
     * @return hashMerkleRoot - 根
     */
    public String getHashmerkleroot() {
        return hashmerkleroot;
    }

    /**
     * 设置根
     *
     * @param hashmerkleroot 根
     */
    public void setHashmerkleroot(String hashmerkleroot) {
        this.hashmerkleroot = hashmerkleroot;
    }

    /**
     * 获取状态
     *
     * @return hashMerkleState - 状态
     */
    public String getHashmerklestate() {
        return hashmerklestate;
    }

    /**
     * 设置状态
     *
     * @param hashmerklestate 状态
     */
    public void setHashmerklestate(String hashmerklestate) {
        this.hashmerklestate = hashmerklestate;
    }

    /**
     * 获取孵化
     *
     * @return hashMerkleIncubate - 孵化
     */
    public String getHashmerkleincubate() {
        return hashmerkleincubate;
    }

    /**
     * 设置孵化
     *
     * @param hashmerkleincubate 孵化
     */
    public void setHashmerkleincubate(String hashmerkleincubate) {
        this.hashmerkleincubate = hashmerkleincubate;
    }

    /**
     * 获取高度
     *
     * @return nHeight - 高度
     */
    public String getNheight() {
        return nheight;
    }

    /**
     * 设置高度
     *
     * @param nheight 高度
     */
    public void setNheight(String nheight) {
        this.nheight = nheight;
    }

    /**
     * 获取时间
     *
     * @return nTime - 时间
     */
    public String getNtime() {
        return ntime;
    }

    /**
     * 设置时间
     *
     * @param ntime 时间
     */
    public void setNtime(String ntime) {
        this.ntime = ntime;
    }

    /**
     * 获取每秒数
     *
     * @return nBits - 每秒数
     */
    public String getNbits() {
        return nbits;
    }

    /**
     * 设置每秒数
     *
     * @param nbits 每秒数
     */
    public void setNbits(String nbits) {
        this.nbits = nbits;
    }

    /**
     * 获取目前
     *
     * @return nNonce - 目前
     */
    public String getNnonce() {
        return nnonce;
    }

    /**
     * 设置目前
     *
     * @param nnonce 目前
     */
    public void setNnonce(String nnonce) {
        this.nnonce = nnonce;
    }

    /**
     * 获取区块通知
     *
     * @return blockNotice - 区块通知
     */
    public String getBlocknotice() {
        return blocknotice;
    }

    /**
     * 设置区块通知
     *
     * @param blocknotice 区块通知
     */
    public void setBlocknotice(String blocknotice) {
        this.blocknotice = blocknotice;
    }

    /**
     * 获取备注
     *
     * @return Remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }
}