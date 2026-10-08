package u4;

import android.graphics.Typeface;
import android.os.Build;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu4/z;", "", "typeface", "Lu4/k;", "font", "Lu4/d0;", "requestedWeight", "Lu4/y;", "requestedStyle", "a", "(ILjava/lang/Object;Lu4/k;Lu4/d0;I)Ljava/lang/Object;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a0 {
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public static final Object a(int i15, Object obj, k kVar, FontWeight fontWeight, int i16) {
        boolean z15;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z16 = false;
        if (!z.k(i15) || fr.t.c(kVar.b(), fontWeight)) {
            z15 = false;
        } else {
            FontWeight.Companion companion = FontWeight.INSTANCE;
            if (fontWeight.compareTo(f.a(companion)) < 0 || kVar.b().compareTo(f.a(companion)) >= 0) {
                z15 = false;
            } else {
                z15 = true;
            }
        }
        boolean z17 = z.j(i15) && !y.f(i16, kVar.c());
        if (!z17 && !z15) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return w0.f195302a.a((Typeface) obj, z15 ? fontWeight.p() : kVar.b().p(), z17 ? y.f(i16, y.INSTANCE.a()) : y.f(kVar.c(), y.INSTANCE.a()));
        }
        if (z17 && y.f(i16, y.INSTANCE.a())) {
            z16 = true;
        }
        return Typeface.create((Typeface) obj, f.b(z15, z16));
    }
}
