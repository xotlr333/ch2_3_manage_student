package org.fastcampus.student_management.domain;

public class CourseFee {

  private int fee;

  public CourseFee(int fee){
    this.fee = fee;
  }

  public void changeFee(int fee){
    checkFee(fee);
    this.fee = fee;
  }

  private void checkFee(int fee){
    if (0 > fee) {
      throw new IllegalArgumentException("음수 요금 입력");
    }
  }

  public int getFee() {
    return fee;
  }
}
