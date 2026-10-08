package zn1;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x40.LinkData;
import x50.NavigationButtonData;
import xn1.Loading;
import xn1.d;
import xn1.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzn1/c;", "Lxw/f;", "Lzn1/c$a;", "Lxn1/i$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "params", "c", "(Lzn1/c$a;)Lxn1/i$a;", "a", "Lmx/c;", "b", "Lu04/a;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: zn1.c$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lzn1/c$a;", "", "Lxn1/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "nextAction", "Lkotlin/Function1;", "", "onLinkClick", "<init>", "(Lxn1/d;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxn1/d;", "d", "()Lxn1/d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLinkClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super String, i0> lVar) {
            this.state = dVar;
            this.onBackClick = aVar;
            this.nextAction = aVar2;
            this.onLinkClick = lVar;
        }

        public final er.a<i0> a() {
            return this.nextAction;
        }

        public final er.a<i0> b() {
            return this.onBackClick;
        }

        public final l<String, i0> c() {
            return this.onLinkClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.nextAction, params.nextAction) && t.c(this.onLinkClick, params.onLinkClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.onLinkClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", nextAction=" + this.nextAction + ", onLinkClick=" + this.onLinkClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f235720a;

        static {
            int[] iArr = new int[mm1.a.values().length];
            try {
                iArr[mm1.a.WARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mm1.a.CHILD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f235720a = iArr;
        }
    }

    public c(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i.a b(Params params) {
        int i15;
        int i16;
        int i17;
        d state = params.getState();
        if (state instanceof Loading) {
            return i.a.c.f219994a;
        }
        if (state instanceof d.a) {
            return new i.a.Error(((d.a) params.getState()).getVmsAdapter());
        }
        if (!(state instanceof d.InterfaceC5873d)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(em1.a.f51975p0), null, null, null, 28, null), null, null, null, null, 61, null);
        mx.c cVar = this.labelProvider;
        mm1.a type = params.getState().getType();
        int[] iArr = b.f235720a;
        int i18 = iArr[type.ordinal()];
        if (i18 == 1) {
            i15 = em1.a.f51987v0;
        } else {
            if (i18 != 2) {
                throw new p();
            }
            i15 = em1.a.f51985u0;
        }
        Label labelC = cVar.c(i15);
        mx.c cVar2 = this.labelProvider;
        int i19 = iArr[params.getState().getType().ordinal()];
        if (i19 == 1) {
            i16 = em1.a.f51979r0;
        } else {
            if (i19 != 2) {
                throw new p();
            }
            i16 = em1.a.f51977q0;
        }
        List listQ = v.q(cVar2.c(i16), this.labelProvider.c(em1.a.f51981s0), this.labelProvider.c(em1.a.f51983t0));
        mx.c cVar3 = this.labelProvider;
        int i25 = iArr[params.getState().getType().ordinal()];
        if (i25 == 1) {
            i17 = em1.a.f51947b0;
        } else {
            if (i25 != 2) {
                throw new p();
            }
            i17 = em1.a.f51945a0;
        }
        return new i.a.Initialized(baseScaffoldData, labelC, listQ, new c30.b.c(null, null, null, cVar3.c(i17), null, null, new c30.a.Link(new LinkData("moreInfoLink", this.labelProvider.c(em1.a.f51978r), this.commonEndpoints.J(), LinkData.EnumC5775a.WEBSITE, false, params.c(), 16, null)), 55, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(em1.a.f51988w), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null));
    }
}
