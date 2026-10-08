package fb4;

import androidx.compose.ui.graphics.Color;
import i40.DialogIconData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfb4/a;", "Lxw/f;", "Lcb4/g;", "Li40/f;", "<init>", "()V", "icon", "c", "(Lcb4/g;)Li40/f;", "dialog_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xw.f<cb4.g, DialogIconData> {

    /* JADX INFO: renamed from: fb4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1376a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61042a;

        static {
            int[] iArr = new int[cb4.g.values().length];
            try {
                iArr[cb4.g.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f61042a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f61043a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-2071890648);
            if (p076m2.t.k()) {
                p076m2.t.o(-2071890648, i15, -1, "pl.gov.coi.shared.segment.dialog.presentation.vms.DialogIconMapper.invoke.<anonymous> (DialogIconMapper.kt:14)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DialogIconData b(cb4.g icon) {
        if (C1376a.f61042a[icon.ordinal()] == 1) {
            return new DialogIconData(jz.a.F, b.f61043a);
        }
        throw new oq.p();
    }
}
