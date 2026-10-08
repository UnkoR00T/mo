package d1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ+\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Ld1/b2;", "", "<init>", "()V", "", "Le4/v;", "measurables", "", "availableHeight", "mainAxisSpacing", "d", "(Ljava/util/List;II)I", "h", "availableWidth", "c", "g", "b", "f", "a", "e", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f39028a = new b2();

    private b2() {
    }

    public final int a(List<? extends p036e4.v> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        List<? extends p036e4.v> list = measurables;
        int size = list.size();
        int iMax = 0;
        float f15 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            p036e4.v vVar = measurables.get(i15);
            float fE = i3.e(i3.c(vVar));
            if (fE == 0.0f) {
                int iMin2 = Math.min(vVar.m0(Integer.MAX_VALUE), availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableWidth - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, vVar.n(iMin2));
            } else if (fE > 0.0f) {
                f15 += fE;
            }
        }
        int iRound = f15 == 0.0f ? 0 : availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableWidth - iMin, 0) / f15);
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            p036e4.v vVar2 = measurables.get(i16);
            float fE2 = i3.e(i3.c(vVar2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, vVar2.n(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int b(List<? extends p036e4.v> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i15 = 0;
        float f15 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            p036e4.v vVar = measurables.get(i16);
            float fE = i3.e(i3.c(vVar));
            int iM0 = vVar.m0(availableHeight);
            if (fE == 0.0f) {
                i15 += iM0;
            } else if (fE > 0.0f) {
                f15 += fE;
                iMax = Math.max(iMax, Math.round(iM0 / fE));
            }
        }
        return Math.round(iMax * f15) + i15 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int c(List<? extends p036e4.v> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        List<? extends p036e4.v> list = measurables;
        int size = list.size();
        int iMax = 0;
        float f15 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            p036e4.v vVar = measurables.get(i15);
            float fE = i3.e(i3.c(vVar));
            if (fE == 0.0f) {
                int iMin2 = Math.min(vVar.m0(Integer.MAX_VALUE), availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableWidth - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, vVar.U(iMin2));
            } else if (fE > 0.0f) {
                f15 += fE;
            }
        }
        int iRound = f15 == 0.0f ? 0 : availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableWidth - iMin, 0) / f15);
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            p036e4.v vVar2 = measurables.get(i16);
            float fE2 = i3.e(i3.c(vVar2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, vVar2.U(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int d(List<? extends p036e4.v> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i15 = 0;
        float f15 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            p036e4.v vVar = measurables.get(i16);
            float fE = i3.e(i3.c(vVar));
            int iE0 = vVar.e0(availableHeight);
            if (fE == 0.0f) {
                i15 += iE0;
            } else if (fE > 0.0f) {
                f15 += fE;
                iMax = Math.max(iMax, Math.round(iE0 / fE));
            }
        }
        return Math.round(iMax * f15) + i15 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int e(List<? extends p036e4.v> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i15 = 0;
        float f15 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            p036e4.v vVar = measurables.get(i16);
            float fE = i3.e(i3.c(vVar));
            int iN = vVar.n(availableWidth);
            if (fE == 0.0f) {
                i15 += iN;
            } else if (fE > 0.0f) {
                f15 += fE;
                iMax = Math.max(iMax, Math.round(iN / fE));
            }
        }
        return Math.round(iMax * f15) + i15 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int f(List<? extends p036e4.v> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        List<? extends p036e4.v> list = measurables;
        int size = list.size();
        int iMax = 0;
        float f15 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            p036e4.v vVar = measurables.get(i15);
            float fE = i3.e(i3.c(vVar));
            if (fE == 0.0f) {
                int iMin2 = Math.min(vVar.n(Integer.MAX_VALUE), availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableHeight - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, vVar.m0(iMin2));
            } else if (fE > 0.0f) {
                f15 += fE;
            }
        }
        int iRound = f15 == 0.0f ? 0 : availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableHeight - iMin, 0) / f15);
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            p036e4.v vVar2 = measurables.get(i16);
            float fE2 = i3.e(i3.c(vVar2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, vVar2.m0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int g(List<? extends p036e4.v> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i15 = 0;
        float f15 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            p036e4.v vVar = measurables.get(i16);
            float fE = i3.e(i3.c(vVar));
            int iU = vVar.U(availableWidth);
            if (fE == 0.0f) {
                i15 += iU;
            } else if (fE > 0.0f) {
                f15 += fE;
                iMax = Math.max(iMax, Math.round(iU / fE));
            }
        }
        return Math.round(iMax * f15) + i15 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int h(List<? extends p036e4.v> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        List<? extends p036e4.v> list = measurables;
        int size = list.size();
        int iMax = 0;
        float f15 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            p036e4.v vVar = measurables.get(i15);
            float fE = i3.e(i3.c(vVar));
            if (fE == 0.0f) {
                int iMin2 = Math.min(vVar.n(Integer.MAX_VALUE), availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableHeight - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, vVar.e0(iMin2));
            } else if (fE > 0.0f) {
                f15 += fE;
            }
        }
        int iRound = f15 == 0.0f ? 0 : availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableHeight - iMin, 0) / f15);
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            p036e4.v vVar2 = measurables.get(i16);
            float fE2 = i3.e(i3.c(vVar2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, vVar2.e0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
