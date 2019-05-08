package pl.krzysiekgl;

public class Button {
  private String title;
  private OnCLickListener onCLickListener;
  
  public Button(String title) {
    this.title = title;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setOnClickListener(OnCLickListener onClickListener) {
    this.onCLickListener = onClickListener;
  }
  
  public void onClick() {
    this.onCLickListener.onClick(this.title);
  }
  
  public interface OnCLickListener {
    public void onClick(String title);
  }
}
