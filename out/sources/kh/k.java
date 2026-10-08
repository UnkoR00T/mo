package kh;

import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import zg.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DecimalFormat f110942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final DecimalFormat f110943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final StringBuilder f110944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f110945d = 0;

    static {
        Locale locale = Locale.ROOT;
        f110942a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f110943b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        f110944c = new StringBuilder();
    }

    public static StringBuilder a(Location location, StringBuilder sb5) {
        sb5.ensureCapacity(100);
        if (location == null) {
            sb5.append((String) null);
            return sb5;
        }
        sb5.append("{");
        sb5.append(location.getProvider());
        sb5.append(", ");
        if (b6.a.h(location)) {
            sb5.append("mock, ");
        }
        DecimalFormat decimalFormat = f110942a;
        sb5.append(decimalFormat.format(location.getLatitude()));
        sb5.append(",");
        sb5.append(decimalFormat.format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb5.append("±");
            sb5.append(f110943b.format(location.getAccuracy()));
            sb5.append("m");
        }
        if (location.hasAltitude()) {
            sb5.append(", alt=");
            DecimalFormat decimalFormat2 = f110943b;
            sb5.append(decimalFormat2.format(location.getAltitude()));
            if (b6.a.g(location)) {
                sb5.append("±");
                sb5.append(decimalFormat2.format(b6.a.d(location)));
            }
            sb5.append("m");
        }
        if (location.hasSpeed()) {
            sb5.append(", spd=");
            DecimalFormat decimalFormat3 = f110943b;
            sb5.append(decimalFormat3.format(location.getSpeed()));
            if (b6.a.f(location)) {
                sb5.append("±");
                sb5.append(decimalFormat3.format(b6.a.c(location)));
            }
            sb5.append("m/s");
        }
        if (location.hasBearing()) {
            sb5.append(", brg=");
            DecimalFormat decimalFormat4 = f110943b;
            sb5.append(decimalFormat4.format(location.getBearing()));
            if (b6.a.e(location)) {
                sb5.append("±");
                sb5.append(decimalFormat4.format(b6.a.a(location)));
            }
            sb5.append("°");
        }
        Bundle extras = location.getExtras();
        String string = extras != null ? extras.getString("floorLabel") : null;
        if (string != null) {
            sb5.append(", fl=");
            sb5.append(string);
        }
        Bundle extras2 = location.getExtras();
        String string2 = extras2 != null ? extras2.getString("levelId") : null;
        if (string2 != null) {
            sb5.append(", lv=");
            sb5.append(string2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        sb5.append(", ert=");
        sb5.append(q0.a(b6.a.b(location) + jCurrentTimeMillis));
        sb5.append('}');
        return sb5;
    }
}
