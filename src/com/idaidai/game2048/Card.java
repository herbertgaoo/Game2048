package com.idaidai.game2048;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {

	public Card(Context context) {
		super(context);

		label = new TextView(getContext());
		label.setTextSize(32);
		label.setGravity(Gravity.CENTER);
		label.setBackgroundColor(0x33ffffff);

		LayoutParams lp = new LayoutParams(-1, -1);
		lp.setMargins(10, 10, 0, 0);
		addView(label, lp);

		setNum(0);
	}

	private TextView label;

	private int num = 0;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
		if(num<=0) {
			label.setText("");
		} else {
			label.setText(num + "");
		}
	}

	public boolean equals(Card o) {
		return getNum() == o.getNum();
	}
}
