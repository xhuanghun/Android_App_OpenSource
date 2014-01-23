package com.ch_linghu.fanfoudroid.app;

import android.graphics.Bitmap;

import com.ch_linghu.fanfoudroid.R;
import com.ch_linghu.fanfoudroid.AppParam;

public interface ImageCache {
	public static Bitmap mDefaultBitmap = ImageManager
			.drawableToBitmap(AppParam.mContext.getResources()
					.getDrawable(R.drawable.user_default_photo));

	public Bitmap get(String url);

	public void put(String url, Bitmap bitmap);
}
