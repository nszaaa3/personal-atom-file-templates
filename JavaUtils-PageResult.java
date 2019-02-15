package util;

import java.io.Serializable;
import java.util.List;

/**
 * @Created with Atom
 * @author @author@
 * @time @timestamp@
 * @description
 * 分页结果
 *
 **/

public class JavaUtils - PageResult implements Serializable {
   private long total; //总记录数
   private List size;  //每页的数据

   public PageResult() {
   }

   public PageResult(long total, List size) {
      this.total = total;
      this.size  = size;
   }

   @Override
   public String toString() {
      return("PageResult{" +
             "total=" + total +
             ", size=" + size +
             '}');
   }

   public long getTotal() {
      return(total);
   }

   public void setTotal(long total) {
      this.total = total;
   }

   public List getSize() {
      return(size);
   }

   public void setSize(List size) {
      this.size = size;
   }
}