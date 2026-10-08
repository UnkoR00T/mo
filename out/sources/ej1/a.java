package ej1;

import iy.c0;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.f;
import zp0.BERegisteredChildParticipant;
import zp0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lzp0/b;", "", "b", "(Lzp0/b;)I", "Lr50/f;", "a", "(Lzp0/b;)Lr50/f;", "", "Lzp0/h;", "Lmx/c;", "labelProvider", "Ln50/g;", "c", "(Ljava/util/List;Lmx/c;)Ljava/util/List;", "defencetraining_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: ej1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1219a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51661a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f51661a = iArr;
        }
    }

    public static final f a(b bVar) {
        int i15 = C1219a.f51661a[bVar.ordinal()];
        if (i15 == 1) {
            return f.POSITIVE;
        }
        if (i15 == 2) {
            return f.INFORMATIVE;
        }
        if (i15 == 3) {
            return f.WARNING;
        }
        if (i15 == 4) {
            return f.NEGATIVE;
        }
        throw new p();
    }

    public static final int b(b bVar) {
        int i15 = C1219a.f51661a[bVar.ordinal()];
        if (i15 == 1) {
            return ri1.b.O0;
        }
        if (i15 == 2) {
            return ri1.b.P0;
        }
        if (i15 == 3) {
            return ri1.b.N0;
        }
        if (i15 == 4) {
            return ri1.b.M0;
        }
        throw new p();
    }

    public static final List<DefaultSingleCardData> c(List<BERegisteredChildParticipant> list, c cVar) {
        Label labelC;
        List<BERegisteredChildParticipant> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            BERegisteredChildParticipant bERegisteredChildParticipant = (BERegisteredChildParticipant) obj;
            boolean z15 = list.size() > 1;
            if (z15) {
                Label labelC2 = cVar.c(ri1.b.f174354c);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(' ');
                sb5.append(i16);
                labelC = labelC2.o(new Label(sb5.toString(), ""));
            } else {
                if (z15) {
                    throw new p();
                }
                labelC = cVar.c(ri1.b.f174354c);
            }
            arrayList.add(new DefaultSingleCardData("ChildParticipant" + i15, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(labelC, null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(bERegisteredChildParticipant.getFirstName()) + Label.INSTANCE.d().getText() + c0.e(bERegisteredChildParticipant.getLastName()), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null));
            i15 = i16;
        }
        return arrayList;
    }
}
