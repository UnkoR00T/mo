package ii;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ak.p0 f92391a = ak.p0.a().g(DayOfWeek.SUNDAY, p.SUNDAY).g(DayOfWeek.MONDAY, p.MONDAY).g(DayOfWeek.TUESDAY, p.TUESDAY).g(DayOfWeek.WEDNESDAY, p.WEDNESDAY).g(DayOfWeek.THURSDAY, p.THURSDAY).g(DayOfWeek.FRIDAY, p.FRIDAY).g(DayOfWeek.SATURDAY, p.SATURDAY).d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b0 f92392b = b0.j(23, 59);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f92393c = 0;

    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    public static Boolean a(l0 l0Var, long j15) {
        ZoneOffset zoneOffsetC;
        l0.c cVarH = l0Var.h();
        Integer numW0 = l0Var.w0();
        if (cVarH != null && cVarH != l0.c.OPERATIONAL) {
            return Boolean.FALSE;
        }
        if (numW0 != null && (zoneOffsetC = c(numW0.intValue())) != null) {
            g0 g0VarL = l0Var.l();
            if (g0VarL == null) {
                g0VarL = l0Var.M();
            } else {
                ArrayList arrayList = new ArrayList(g0VarL.c());
                if (arrayList.isEmpty()) {
                    g0VarL = l0Var.M();
                } else {
                    try {
                        Collections.sort(arrayList, b7.f92379a);
                        a0 a0VarB = ((y0) zj.p.q(((j0) arrayList.get(0)).c())).b();
                        a0 a0VarB2 = ((y0) zj.p.q(((j0) ak.x0.f(arrayList)).b())).b();
                        if (a0VarB == null || a0VarB2 == null) {
                            g0VarL = l0Var.M();
                        } else if (!ak.q1.d(Long.valueOf(b(zoneOffsetC, a0VarB, 0, 0)), Long.valueOf(b(zoneOffsetC, a0VarB2, 23, 59))).g(Long.valueOf(j15))) {
                            g0VarL = l0Var.M();
                        }
                    } catch (NullPointerException unused) {
                    }
                }
            }
            if (g0VarL != null) {
                List<j0> listC = g0VarL.c();
                if (listC.isEmpty()) {
                    return Boolean.FALSE;
                }
                if (listC.size() == 1) {
                    j0 j0Var = listC.get(0);
                    y0 y0VarC = j0Var.c();
                    if (j0Var.b() == null && y0VarC != null && y0VarC.c() == p.SUNDAY && y0VarC.d().e() == 0 && y0VarC.d().g() == 0) {
                        return Boolean.TRUE;
                    }
                }
                for (j0 j0Var2 : listC) {
                    if (j0Var2.c() == null || j0Var2.b() == null) {
                    }
                }
                OffsetDateTime offsetDateTimeAtOffset = Instant.ofEpochMilli(j15).atOffset(zoneOffsetC);
                p pVar = (p) f92391a.get(offsetDateTimeAtOffset.getDayOfWeek());
                b0 b0VarJ = b0.j(offsetDateTimeAtOffset.getHour(), offsetDateTimeAtOffset.getMinute());
                EnumMap enumMap = new EnumMap(p.class);
                if (!listC.isEmpty()) {
                    j0 j0VarA = listC.get(0);
                    int i15 = 0;
                    while (j0VarA != null) {
                        y0 y0VarC2 = j0VarA.c();
                        y0 y0VarB = j0VarA.b();
                        if (y0VarC2 == null || y0VarB == null) {
                            i15++;
                            j0VarA = i15 >= listC.size() ? null : listC.get(i15);
                        } else {
                            p pVarC = y0VarC2.c();
                            b0 b0VarD = y0VarC2.d();
                            if (y0VarC2.c() != y0VarB.c()) {
                                b0 b0Var = f92392b;
                                List list = (List) enumMap.getOrDefault(pVarC, new ArrayList());
                                list.add(ak.q1.d(b0VarD, b0Var));
                                enumMap.put(pVarC, list);
                                y0 y0VarF = y0.f(p.values()[(pVarC.ordinal() + 1) % 7], b0.j(0, 0));
                                y0 y0VarB2 = j0VarA.b();
                                j0.a aVarA = j0.a();
                                aVarA.c(y0VarF);
                                aVarA.b(y0VarB2);
                                j0VarA = aVarA.a();
                            } else {
                                i15++;
                                b0 b0VarD2 = y0VarB.d();
                                List list2 = (List) enumMap.getOrDefault(pVarC, new ArrayList());
                                list2.add(ak.q1.e(b0VarD, b0VarD2));
                                enumMap.put(pVarC, list2);
                                if (i15 < listC.size()) {
                                    j0VarA = listC.get(i15);
                                }
                            }
                        }
                    }
                }
                List list3 = (List) enumMap.get(pVar);
                if (list3 == null) {
                    return Boolean.FALSE;
                }
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    if (((ak.q1) it.next()).g(b0VarJ)) {
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            }
        }
        return null;
    }

    static long b(ZoneOffset zoneOffset, a0 a0Var, int i15, int i16) {
        return OffsetDateTime.of(LocalDate.of(a0Var.j(), a0Var.g(), a0Var.e()), LocalTime.of(i15, i16), zoneOffset).toInstant().toEpochMilli();
    }

    private static ZoneOffset c(int i15) {
        try {
            return ZoneOffset.ofTotalSeconds(i15 * 60);
        } catch (DateTimeException unused) {
            io.sentry.android.core.c2.g("Places OpeningHoursUtil", String.format("Cannot find timezone that associates with utcOffsetMinutes %d from Place object.", Integer.valueOf(i15)));
            return null;
        }
    }
}
