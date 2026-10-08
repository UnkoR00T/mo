package ev3;

import android.graphics.Bitmap;
import dv3.State;
import dx.i;
import e20.k;
import er.p;
import fr.t;
import fr.w0;
import iy.b0;
import java.util.ArrayList;
import java.util.List;
import l60.KeyValueData;
import mx.Label;
import o20.DocumentGiloshData;
import o20.u2;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f*\b\u0012\u0004\u0012\u00020\u00150\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lev3/a;", "Lxw/f;", "Lev3/a$a;", "Ldv3/d$a;", "Lmx/c;", "labelProvider", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "<init>", "(Lmx/c;Lrz/a;Liy/a;)V", "", "Lbv3/c$c;", "Lo20/u2;", "i", "(Ljava/util/List;)Ljava/util/List;", "Lbv3/c$a;", "Le20/k;", "f", "(Lbv3/c$a;)Le20/k;", "Lbv3/c$b;", "Ll60/c;", "h", "Ldv3/r;", "Lmx/a;", "c", "(Ldv3/r;)Lmx/a;", "params", "e", "(Lev3/a$a;)Ldv3/d$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lrz/a;", "getBitmapDecoder", "()Lrz/a;", "Liy/a;", "getBase64Coder", "()Liy/a;", "documentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, dv3.d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: ev3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lev3/a$a;", "", "Ldv3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onToggleAnimations", "<init>", "(Ldv3/c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldv3/c;", "b", "()Ldv3/c;", "Ler/a;", "()Ler/a;", "documentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onToggleAnimations;

        public Params(State state, er.a<i0> aVar) {
            this.state = state;
            this.onToggleAnimations = aVar;
        }

        public final er.a<i0> a() {
            return this.onToggleAnimations;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onToggleAnimations, params.onToggleAnimations);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onToggleAnimations.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onToggleAnimations=" + this.onToggleAnimations + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53824a;

        static {
            int[] iArr = new int[bv3.c.a.values().length];
            try {
                iArr[bv3.c.a.Poland.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bv3.c.a.Ukraine.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f53824a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f53825a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(Object obj, Object obj2) {
            return c((r) obj, ((Number) obj2).intValue());
        }

        public final Void c(r rVar, int i15) {
            rVar.X(-1597118005);
            if (p076m2.t.k()) {
                p076m2.t.o(-1597118005, i15, -1, "pl.gov.coi.mobywatel.segment.documentcard.presentation.mapper.DocumentCardViewMapper.invoke.<anonymous>.<anonymous> (DocumentCardViewMapper.kt:54)");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f53826a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(Object obj, Object obj2) {
            return c((r) obj, ((Number) obj2).intValue());
        }

        public final Void c(r rVar, int i15) {
            rVar.X(2107911812);
            if (p076m2.t.k()) {
                p076m2.t.o(2107911812, i15, -1, "pl.gov.coi.mobywatel.segment.documentcard.presentation.mapper.DocumentCardViewMapper.invoke.<anonymous>.<anonymous> (DocumentCardViewMapper.kt:70)");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f53827a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(Object obj, Object obj2) {
            return c((r) obj, ((Number) obj2).intValue());
        }

        public final Void c(r rVar, int i15) {
            rVar.X(-739553730);
            if (p076m2.t.k()) {
                p076m2.t.o(-739553730, i15, -1, "pl.gov.coi.mobywatel.segment.documentcard.presentation.mapper.DocumentCardViewMapper.invoke.<anonymous>.<anonymous> (DocumentCardViewMapper.kt:71)");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return null;
        }
    }

    public a(mx.c cVar, rz.a aVar, iy.a aVar2) {
        this.labelProvider = cVar;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
    }

    private final Label c(dv3.r rVar) {
        boolean z15 = rVar instanceof dv3.r.Disabled;
        if (z15 && ((dv3.r.Disabled) rVar).getForceEnabled()) {
            return this.labelProvider.c(av3.a.f14721a);
        }
        if (z15) {
            return this.labelProvider.c(av3.a.f14722b);
        }
        return null;
    }

    private final k f(bv3.c.a aVar) {
        int i15 = b.f53824a[aVar.ordinal()];
        if (i15 == 1) {
            return k.Poland;
        }
        if (i15 == 2) {
            return k.Ukraine;
        }
        throw new oq.p();
    }

    private final List<KeyValueData> h(List<bv3.c.KeyValueItem> list) {
        List<bv3.c.KeyValueItem> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (bv3.c.KeyValueItem keyValueItem : list2) {
            arrayList.add(new KeyValueData(keyValueItem.getLabel(), keyValueItem.getDescription(), keyValueItem.getReadLetterByLetter()));
        }
        return arrayList;
    }

    private final List<u2> i(List<? extends bv3.c.InterfaceC0572c> list) {
        Object hologram;
        List<? extends bv3.c.InterfaceC0572c> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (bv3.c.InterfaceC0572c interfaceC0572c : list2) {
            if (interfaceC0572c instanceof bv3.c.InterfaceC0572c.Flag) {
                bv3.c.InterfaceC0572c.Flag flag = (bv3.c.InterfaceC0572c.Flag) interfaceC0572c;
                hologram = new u2.Flag(f(flag.getFlag()), flag.getLogoFlagContentDescription());
            } else if (interfaceC0572c instanceof bv3.c.InterfaceC0572c.C0573c) {
                bv3.c.InterfaceC0572c.C0573c c0573c = (bv3.c.InterfaceC0572c.C0573c) interfaceC0572c;
                hologram = new u2.Logo(c0573c.b(), c0573c.a());
            } else {
                if (!(interfaceC0572c instanceof bv3.c.InterfaceC0572c.b)) {
                    throw new oq.p();
                }
                hologram = new u2.Hologram(null, null, 3, null);
            }
            arrayList.add(hologram);
        }
        return arrayList;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public dv3.d.Data b(Params params) {
        Bitmap bitmap;
        Bitmap bitmapA;
        bv3.c setupData = params.getState().getSetupData();
        boolean z15 = (params.getState().getAnimationsState() instanceof dv3.r.Disabled) && !((dv3.r.Disabled) params.getState().getAnimationsState()).getForceEnabled();
        boolean z16 = setupData.getValidity() instanceof bv3.c.e.Valid;
        List<u2> listI = i(setupData.c());
        o20.p pVarB = o20.p.INSTANCE.b(setupData.getBackgroundId());
        b0 photoValue = setupData.getPhotoValue();
        if (photoValue != null) {
            i iVarF = iy.a.f(this.base64Coder, ry.a.a(photoValue).getData(), null, 2, null);
            if (iVarF instanceof i.Left) {
                bitmapA = null;
            } else {
                if (!(iVarF instanceof i.Right)) {
                    throw new oq.p();
                }
                bitmapA = this.bitmapDecoder.a((byte[]) ((i.Right) iVarF).b());
            }
            bitmap = bitmapA;
        } else {
            bitmap = null;
        }
        Label labelC = this.labelProvider.c(av3.a.f14723c);
        p pVar = (p) w0.g(c.f53825a, 2);
        Label label = setupData.getValidity().getLabel();
        setupData.e();
        return new dv3.d.Data(new DocumentGiloshData(null, listI, pVarB, params.getState().getDocumentVMS(), bitmap, null, labelC, pVar, null, z16, label, null, h(setupData.b()), (p) w0.g(d.f53826a, 2), (p) w0.g(e.f53827a, 2), !z15, c(params.getState().getAnimationsState()), params.a(), 32, null));
    }
}
