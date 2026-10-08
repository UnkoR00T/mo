package gd;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import td.j;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Paint {
    public a() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i15) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(j.c(i15, 0, GF2Field.MASK));
        } else {
            setColor((j.c(i15, 0, GF2Field.MASK) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public a(int i15) {
        super(i15);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(int i15, PorterDuff.Mode mode) {
        super(i15);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
