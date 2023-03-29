package chap11_interface.device;

public interface TV extends Display, Speaker{
	void changeChannel(int channel);
}
