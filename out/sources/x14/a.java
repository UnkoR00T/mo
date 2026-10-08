package x14;

import fu.r;
import fz.f;
import iy.c0;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import p071kotlin.Metadata;
import xw.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lx14/a;", "Lg14/a;", "Lez/a;", "currentTimeProvider", "<init>", "(Lez/a;)V", "Lg14/a$a;", "params", "Lg14/a$b;", "b", "(Lg14/a$a;)Lg14/a$b;", "a", "Lez/a;", "", "", "c", "(I)Z", "isEven", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements g14.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    public a(ez.a aVar) {
        this.currentTimeProvider = aVar;
    }

    private final boolean c(int i15) {
        return i15 % 2 == 0;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g14.a.b a(g14.a.Params params) {
        e eVar;
        int i15;
        String strE = c0.e(params.getPesel());
        if (strE.length() != 11) {
            return g14.a.b.C1568a.f69766a;
        }
        for (int i16 = 0; i16 < strE.length(); i16++) {
            if (!Character.isDigit(strE.charAt(i16))) {
                return g14.a.b.C1569b.f69767a;
            }
        }
        int i17 = Integer.parseInt(strE.substring(2, 4));
        int i18 = Integer.parseInt(r.H1(strE, 2));
        Integer numValueOf = Integer.valueOf(fu.a.f(strE.charAt(r.k0(strE) - 1)));
        if (!c(numValueOf.intValue())) {
            numValueOf = null;
        }
        if (numValueOf == null || (eVar = e.FEMALE) == null) {
            eVar = e.MALE;
        }
        if (81 <= i17 && i17 < 93) {
            i15 = 1800;
        } else if (1 <= i17 && i17 < 13) {
            i15 = 1900;
        } else if (21 <= i17 && i17 < 33) {
            i15 = 2000;
        } else if (41 <= i17 && i17 < 53) {
            i15 = 2100;
        } else {
            if (61 > i17 || i17 >= 73) {
                return g14.a.b.C1569b.f69767a;
            }
            i15 = 2200;
        }
        int i19 = i15 + i18;
        int i25 = i17 % 20;
        int i26 = i25 + ((((i25 ^ 20) & ((-i25) | i25)) >> 31) & 20);
        int i27 = Integer.parseInt(strE.substring(4, 6));
        ZoneId zoneIdOf = ZoneId.of(f.POLISH.getId());
        try {
            LocalTime localTime = LocalTime.MIN;
            ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(i19, i26, i27, localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNano(), zoneIdOf);
            return new g14.a.b.Success((int) ChronoUnit.YEARS.between(zonedDateTimeOf, this.currentTimeProvider.c().atStartOfDay(zoneIdOf)), eVar, zonedDateTimeOf.toLocalDate());
        } catch (DateTimeException unused) {
            return g14.a.b.C1569b.f69767a;
        }
    }
}
