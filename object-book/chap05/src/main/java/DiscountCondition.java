
public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);

    DiscountConditionType getType();
}
