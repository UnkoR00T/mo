package z1;

import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lz1/y1;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lz1/i0;", "selectedTextType", "Landroid/view/textclassifier/TextClassifier;", "a", "(Landroid/content/Context;Lz1/i0;)Landroid/view/textclassifier/TextClassifier;", "Lx4/d;", "localeList", "Landroid/os/LocaleList;", "c", "(Lx4/d;)Landroid/os/LocaleList;", "Landroid/view/textclassifier/TextClassification;", "", "b", "(Landroid/view/textclassifier/TextClassification;)Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f232265a = new y1();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f232266a;

        static {
            int[] iArr = new int[i0.values().length];
            try {
                iArr[i0.EditableText.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i0.StaticText.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f232266a = iArr;
        }
    }

    private y1() {
    }

    public final TextClassifier a(Context context, i0 selectedTextType) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int i15 = a.f232266a[selectedTextType.ordinal()];
        if (i15 == 1) {
            str = "edittext";
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            str = "textview";
        }
        x1.a();
        return textClassificationManager.createTextClassificationSession(w1.a(context.getPackageName(), str).build());
    }

    public final boolean b(TextClassification textClassification) {
        if (textClassification.getIcon() == null && TextUtils.isEmpty(textClassification.getLabel())) {
            return false;
        }
        return (textClassification.getIntent() == null && textClassification.getOnClickListener() == null) ? false : true;
    }

    public final LocaleList c(x4.LocaleList localeList) {
        ArrayList arrayList = new ArrayList(pq.v.y(localeList, 10));
        Iterator<x4.c> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
