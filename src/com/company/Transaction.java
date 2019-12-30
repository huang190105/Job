package com.company;


public class Transaction {

    private String transactionhash;

    /**
     * 版本
     */
    private String version;

    /**
     * 类型
     */
    private String type;

    /**
     * 临时字段
     */
    private String nonce;

    private String from;

    private String gasprice;

    /**
     * 金额
     */
    private String amount;


    private String to;


    private String blockhash;

    /**
     * 费用
     */
    private String fee;

    private String blockheight;


    private String remarks;

    /**
     * 状态
     */
    private String status;

    /**
     * 获取主键
     *
     * @return transactionHash - 主键
     */
    public String getTransactionhash() {
        return transactionhash;
    }

    /**
     * 设置主键
     *
     * @param transactionhash 主键
     */
    public void setTransactionhash(String transactionhash) {
        this.transactionhash = transactionhash;
    }

    /**
     * 获取版本
     *
     * @return version - 版本
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取临时字段
     *
     * @return nonce - 临时字段
     */
    public String getNonce() {
        return nonce;
    }

    /**
     * 设置临时字段
     *
     * @param nonce 临时字段
     */
    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    /**
     * 获取开始
     *
     * @return fromAddress - 开始
     */
    public String getFrom() {
        return from;
    }

    /**
     * 设置开始
     *
     * @param fromaddress 开始
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * 获取价格
     *
     * @return gasPrice - 价格
     */
    public String getGasprice() {
        return gasprice;
    }

    /**
     * 设置价格
     *
     * @param gasprice 价格
     */
    public void setGasprice(String gasprice) {
        this.gasprice = gasprice;
    }

    /**
     * 获取金额
     *
     * @return amount - 金额
     */
    public String getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * 获取前往
     *
     * @return toAddress - 前往
     */
    public String getTo() {
        return to;
    }

    /**
     * 设置前往
     *
     * @param toaddress 前往
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * 获取区块主键
     *
     * @return blockHash - 区块主键
     */
    public String getBlockhash() {
        return blockhash;
    }

    /**
     * 设置区块主键
     *
     * @param blockhash 区块主键
     */
    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    /**
     * 获取费用
     *
     * @return fee - 费用
     */
    public String getFee() {
        return fee;
    }

    /**
     * 设置费用
     *
     * @param fee 费用
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     * 获取区块高度
     *
     * @return blockHeight - 区块高度
     */
    public String getBlockheight() {
        return blockheight;
    }

    /**
     * 设置区块高度
     *
     * @param blockheight 区块高度
     */
    public void setBlockheight(String blockheight) {
        this.blockheight = blockheight;
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