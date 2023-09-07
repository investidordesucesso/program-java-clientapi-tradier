/*
 * Tradier API
 * Tradier API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * QuotesQuotesQuote
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-31T14:29:22.511420325Z[GMT]")

public class QuotesQuotesQuote {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("exch")
  private String exch = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("last")
  private BigDecimal last = null;

  @SerializedName("change")
  private BigDecimal change = null;

  @SerializedName("volume")
  private Integer volume = null;

  @SerializedName("open")
  private BigDecimal open = null;

  @SerializedName("high")
  private BigDecimal high = null;

  @SerializedName("low")
  private BigDecimal low = null;

  @SerializedName("close")
  private String close = null;

  @SerializedName("bid")
  private BigDecimal bid = null;

  @SerializedName("ask")
  private BigDecimal ask = null;

  @SerializedName("change_percentage")
  private BigDecimal changePercentage = null;

  @SerializedName("average_volume")
  private Integer averageVolume = null;

  @SerializedName("last_volume")
  private Integer lastVolume = null;

  @SerializedName("trade_date")
  private Long tradeDate = null;

  @SerializedName("prevclose")
  private BigDecimal prevclose = null;

  @SerializedName("week_52_high")
  private BigDecimal week52High = null;

  @SerializedName("week_52_low")
  private BigDecimal week52Low = null;

  @SerializedName("bidsize")
  private Integer bidsize = null;

  @SerializedName("bidexch")
  private String bidexch = null;

  @SerializedName("bid_date")
  private Long bidDate = null;

  @SerializedName("asksize")
  private Integer asksize = null;

  @SerializedName("askexch")
  private String askexch = null;

  @SerializedName("ask_date")
  private Long askDate = null;

  @SerializedName("root_symbols")
  private String rootSymbols = null;

  public QuotesQuotesQuote symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @Schema(description = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public QuotesQuotesQuote description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public QuotesQuotesQuote exch(String exch) {
    this.exch = exch;
    return this;
  }

   /**
   * Get exch
   * @return exch
  **/
  @Schema(description = "")
  public String getExch() {
    return exch;
  }

  public void setExch(String exch) {
    this.exch = exch;
  }

  public QuotesQuotesQuote type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public QuotesQuotesQuote last(BigDecimal last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @Schema(description = "")
  public BigDecimal getLast() {
    return last;
  }

  public void setLast(BigDecimal last) {
    this.last = last;
  }

  public QuotesQuotesQuote change(BigDecimal change) {
    this.change = change;
    return this;
  }

   /**
   * Get change
   * @return change
  **/
  @Schema(description = "")
  public BigDecimal getChange() {
    return change;
  }

  public void setChange(BigDecimal change) {
    this.change = change;
  }

  public QuotesQuotesQuote volume(Integer volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @Schema(description = "")
  public Integer getVolume() {
    return volume;
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
  }

  public QuotesQuotesQuote open(BigDecimal open) {
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  @Schema(description = "")
  public BigDecimal getOpen() {
    return open;
  }

  public void setOpen(BigDecimal open) {
    this.open = open;
  }

  public QuotesQuotesQuote high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @Schema(description = "")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public QuotesQuotesQuote low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @Schema(description = "")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public QuotesQuotesQuote close(String close) {
    this.close = close;
    return this;
  }

   /**
   * Get close
   * @return close
  **/
  @Schema(description = "")
  public String getClose() {
    return close;
  }

  public void setClose(String close) {
    this.close = close;
  }

  public QuotesQuotesQuote bid(BigDecimal bid) {
    this.bid = bid;
    return this;
  }

   /**
   * Get bid
   * @return bid
  **/
  @Schema(description = "")
  public BigDecimal getBid() {
    return bid;
  }

  public void setBid(BigDecimal bid) {
    this.bid = bid;
  }

  public QuotesQuotesQuote ask(BigDecimal ask) {
    this.ask = ask;
    return this;
  }

   /**
   * Get ask
   * @return ask
  **/
  @Schema(description = "")
  public BigDecimal getAsk() {
    return ask;
  }

  public void setAsk(BigDecimal ask) {
    this.ask = ask;
  }

  public QuotesQuotesQuote changePercentage(BigDecimal changePercentage) {
    this.changePercentage = changePercentage;
    return this;
  }

   /**
   * Get changePercentage
   * @return changePercentage
  **/
  @Schema(description = "")
  public BigDecimal getChangePercentage() {
    return changePercentage;
  }

  public void setChangePercentage(BigDecimal changePercentage) {
    this.changePercentage = changePercentage;
  }

  public QuotesQuotesQuote averageVolume(Integer averageVolume) {
    this.averageVolume = averageVolume;
    return this;
  }

   /**
   * Get averageVolume
   * @return averageVolume
  **/
  @Schema(description = "")
  public Integer getAverageVolume() {
    return averageVolume;
  }

  public void setAverageVolume(Integer averageVolume) {
    this.averageVolume = averageVolume;
  }

  public QuotesQuotesQuote lastVolume(Integer lastVolume) {
    this.lastVolume = lastVolume;
    return this;
  }

   /**
   * Get lastVolume
   * @return lastVolume
  **/
  @Schema(description = "")
  public Integer getLastVolume() {
    return lastVolume;
  }

  public void setLastVolume(Integer lastVolume) {
    this.lastVolume = lastVolume;
  }

  public QuotesQuotesQuote tradeDate(Long tradeDate) {
    this.tradeDate = tradeDate;
    return this;
  }

   /**
   * Get tradeDate
   * @return tradeDate
  **/
  @Schema(description = "")
  public Long getTradeDate() {
    return tradeDate;
  }

  public void setTradeDate(Long tradeDate) {
    this.tradeDate = tradeDate;
  }

  public QuotesQuotesQuote prevclose(BigDecimal prevclose) {
    this.prevclose = prevclose;
    return this;
  }

   /**
   * Get prevclose
   * @return prevclose
  **/
  @Schema(description = "")
  public BigDecimal getPrevclose() {
    return prevclose;
  }

  public void setPrevclose(BigDecimal prevclose) {
    this.prevclose = prevclose;
  }

  public QuotesQuotesQuote week52High(BigDecimal week52High) {
    this.week52High = week52High;
    return this;
  }

   /**
   * Get week52High
   * @return week52High
  **/
  @Schema(description = "")
  public BigDecimal getWeek52High() {
    return week52High;
  }

  public void setWeek52High(BigDecimal week52High) {
    this.week52High = week52High;
  }

  public QuotesQuotesQuote week52Low(BigDecimal week52Low) {
    this.week52Low = week52Low;
    return this;
  }

   /**
   * Get week52Low
   * @return week52Low
  **/
  @Schema(description = "")
  public BigDecimal getWeek52Low() {
    return week52Low;
  }

  public void setWeek52Low(BigDecimal week52Low) {
    this.week52Low = week52Low;
  }

  public QuotesQuotesQuote bidsize(Integer bidsize) {
    this.bidsize = bidsize;
    return this;
  }

   /**
   * Get bidsize
   * @return bidsize
  **/
  @Schema(description = "")
  public Integer getBidsize() {
    return bidsize;
  }

  public void setBidsize(Integer bidsize) {
    this.bidsize = bidsize;
  }

  public QuotesQuotesQuote bidexch(String bidexch) {
    this.bidexch = bidexch;
    return this;
  }

   /**
   * Get bidexch
   * @return bidexch
  **/
  @Schema(description = "")
  public String getBidexch() {
    return bidexch;
  }

  public void setBidexch(String bidexch) {
    this.bidexch = bidexch;
  }

  public QuotesQuotesQuote bidDate(Long bidDate) {
    this.bidDate = bidDate;
    return this;
  }

   /**
   * Get bidDate
   * @return bidDate
  **/
  @Schema(description = "")
  public Long getBidDate() {
    return bidDate;
  }

  public void setBidDate(Long bidDate) {
    this.bidDate = bidDate;
  }

  public QuotesQuotesQuote asksize(Integer asksize) {
    this.asksize = asksize;
    return this;
  }

   /**
   * Get asksize
   * @return asksize
  **/
  @Schema(description = "")
  public Integer getAsksize() {
    return asksize;
  }

  public void setAsksize(Integer asksize) {
    this.asksize = asksize;
  }

  public QuotesQuotesQuote askexch(String askexch) {
    this.askexch = askexch;
    return this;
  }

   /**
   * Get askexch
   * @return askexch
  **/
  @Schema(description = "")
  public String getAskexch() {
    return askexch;
  }

  public void setAskexch(String askexch) {
    this.askexch = askexch;
  }

  public QuotesQuotesQuote askDate(Long askDate) {
    this.askDate = askDate;
    return this;
  }

   /**
   * Get askDate
   * @return askDate
  **/
  @Schema(description = "")
  public Long getAskDate() {
    return askDate;
  }

  public void setAskDate(Long askDate) {
    this.askDate = askDate;
  }

  public QuotesQuotesQuote rootSymbols(String rootSymbols) {
    this.rootSymbols = rootSymbols;
    return this;
  }

   /**
   * Get rootSymbols
   * @return rootSymbols
  **/
  @Schema(description = "")
  public String getRootSymbols() {
    return rootSymbols;
  }

  public void setRootSymbols(String rootSymbols) {
    this.rootSymbols = rootSymbols;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotesQuotesQuote quotesQuotesQuote = (QuotesQuotesQuote) o;
    return Objects.equals(this.symbol, quotesQuotesQuote.symbol) &&
        Objects.equals(this.description, quotesQuotesQuote.description) &&
        Objects.equals(this.exch, quotesQuotesQuote.exch) &&
        Objects.equals(this.type, quotesQuotesQuote.type) &&
        Objects.equals(this.last, quotesQuotesQuote.last) &&
        Objects.equals(this.change, quotesQuotesQuote.change) &&
        Objects.equals(this.volume, quotesQuotesQuote.volume) &&
        Objects.equals(this.open, quotesQuotesQuote.open) &&
        Objects.equals(this.high, quotesQuotesQuote.high) &&
        Objects.equals(this.low, quotesQuotesQuote.low) &&
        Objects.equals(this.close, quotesQuotesQuote.close) &&
        Objects.equals(this.bid, quotesQuotesQuote.bid) &&
        Objects.equals(this.ask, quotesQuotesQuote.ask) &&
        Objects.equals(this.changePercentage, quotesQuotesQuote.changePercentage) &&
        Objects.equals(this.averageVolume, quotesQuotesQuote.averageVolume) &&
        Objects.equals(this.lastVolume, quotesQuotesQuote.lastVolume) &&
        Objects.equals(this.tradeDate, quotesQuotesQuote.tradeDate) &&
        Objects.equals(this.prevclose, quotesQuotesQuote.prevclose) &&
        Objects.equals(this.week52High, quotesQuotesQuote.week52High) &&
        Objects.equals(this.week52Low, quotesQuotesQuote.week52Low) &&
        Objects.equals(this.bidsize, quotesQuotesQuote.bidsize) &&
        Objects.equals(this.bidexch, quotesQuotesQuote.bidexch) &&
        Objects.equals(this.bidDate, quotesQuotesQuote.bidDate) &&
        Objects.equals(this.asksize, quotesQuotesQuote.asksize) &&
        Objects.equals(this.askexch, quotesQuotesQuote.askexch) &&
        Objects.equals(this.askDate, quotesQuotesQuote.askDate) &&
        Objects.equals(this.rootSymbols, quotesQuotesQuote.rootSymbols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, description, exch, type, last, change, volume, open, high, low, close, bid, ask, changePercentage, averageVolume, lastVolume, tradeDate, prevclose, week52High, week52Low, bidsize, bidexch, bidDate, asksize, askexch, askDate, rootSymbols);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotesQuotesQuote {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exch: ").append(toIndentedString(exch)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    changePercentage: ").append(toIndentedString(changePercentage)).append("\n");
    sb.append("    averageVolume: ").append(toIndentedString(averageVolume)).append("\n");
    sb.append("    lastVolume: ").append(toIndentedString(lastVolume)).append("\n");
    sb.append("    tradeDate: ").append(toIndentedString(tradeDate)).append("\n");
    sb.append("    prevclose: ").append(toIndentedString(prevclose)).append("\n");
    sb.append("    week52High: ").append(toIndentedString(week52High)).append("\n");
    sb.append("    week52Low: ").append(toIndentedString(week52Low)).append("\n");
    sb.append("    bidsize: ").append(toIndentedString(bidsize)).append("\n");
    sb.append("    bidexch: ").append(toIndentedString(bidexch)).append("\n");
    sb.append("    bidDate: ").append(toIndentedString(bidDate)).append("\n");
    sb.append("    asksize: ").append(toIndentedString(asksize)).append("\n");
    sb.append("    askexch: ").append(toIndentedString(askexch)).append("\n");
    sb.append("    askDate: ").append(toIndentedString(askDate)).append("\n");
    sb.append("    rootSymbols: ").append(toIndentedString(rootSymbols)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}