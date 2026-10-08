package p046f2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\" \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f*\n\u0010\u0011\"\u00020\u00052\u00020\u0005¨\u0006\u0012"}, d2 = {"", "minDigits", "maxDigits", "", "isGroupingUsed", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "", "b", "(IIIZLjava/util/Locale;)Ljava/lang/String;", "Ljava/text/NumberFormat;", "a", "(IIZLjava/util/Locale;)Ljava/text/NumberFormat;", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "cachedFormatters", "CalendarLocale", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final WeakHashMap<String, NumberFormat> f58157a = new WeakHashMap<>();

    private static final NumberFormat a(int i15, int i16, boolean z15, Locale locale) {
        String str = i15 + '.' + i16 + '.' + z15 + '.' + locale.toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = f58157a;
        NumberFormat integerInstance = weakHashMap.get(str);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(z15);
            integerInstance.setMinimumIntegerDigits(i15);
            integerInstance.setMaximumIntegerDigits(i16);
            weakHashMap.put(str, integerInstance);
        }
        return integerInstance;
    }

    public static final String b(int i15, int i16, int i17, boolean z15, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return a(i16, i17, z15, locale).format(Integer.valueOf(i15));
    }

    public static /* synthetic */ String c(int i15, int i16, int i17, boolean z15, Locale locale, int i18, Object obj) {
        if ((i18 & 1) != 0) {
            i16 = 1;
        }
        if ((i18 & 2) != 0) {
            i17 = 40;
        }
        if ((i18 & 4) != 0) {
            z15 = false;
        }
        if ((i18 & 8) != 0) {
            locale = null;
        }
        return b(i15, i16, i17, z15, locale);
    }
}
