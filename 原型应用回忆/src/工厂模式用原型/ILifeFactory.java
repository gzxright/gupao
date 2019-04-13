package 工厂模式用原型;

/**
 * 工厂类
 *
 * @author
 *
 */
public interface ILifeFactory {
  /**
   * 生产DayLife对象
   *
   * @return
   */
  public DayLife getNewInstance();
}