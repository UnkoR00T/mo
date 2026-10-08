package dn1;

import al0.c0;
import bn1.State;
import bn1.e;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ldn1/b;", "Lxw/f;", "Ldn1/b$a;", "Lbn1/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lal0/c0;", "Lmm1/a;", "type", "", "e", "(Lal0/c0;Lmm1/a;)I", "params", "f", "(Ldn1/b$a;)Lbn1/e$a;", "a", "Lmx/c;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: dn1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Ldn1/b$a;", "", "Lbn1/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Lkotlin/Function1;", "Lal0/c0;", "nextAction", "<init>", "(Lbn1/d;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbn1/d;", "c", "()Lbn1/d;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<c0, i0> nextAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super c0, i0> lVar) {
            this.state = state;
            this.backAction = aVar;
            this.nextAction = lVar;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final l<c0, i0> b() {
            return this.nextAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.nextAction, params.nextAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.nextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", nextAction=" + this.nextAction + ')';
        }
    }

    /* JADX INFO: renamed from: dn1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0975b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43519b;

        static {
            int[] iArr = new int[mm1.a.values().length];
            try {
                iArr[mm1.a.CHILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mm1.a.WARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43518a = iArr;
            int[] iArr2 = new int[c0.values().length];
            try {
                iArr2[c0.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[c0.UNSUSPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f43519b = iArr2;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final int e(c0 c0Var, mm1.a aVar) {
        int i15 = C0975b.f43519b[c0Var.ordinal()];
        if (i15 == 1) {
            int i16 = C0975b.f43518a[aVar.ordinal()];
            if (i16 == 1) {
                return em1.a.S;
            }
            if (i16 == 2) {
                return em1.a.W;
            }
            throw new p();
        }
        if (i15 != 2) {
            throw new p();
        }
        int i17 = C0975b.f43518a[aVar.ordinal()];
        if (i17 == 1) {
            return em1.a.T;
        }
        if (i17 == 2) {
            return em1.a.X;
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, c0 c0Var) {
        params.b().b(c0Var);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(em1.a.V), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(em1.a.U);
        wq.a<c0> aVarE = c0.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE, 10));
        for (final c0 c0Var : aVarE) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: dn1.a
                @Override // er.a
                public final Object a() {
                    return b.h(params, c0Var);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(e(c0Var, params.getState().getType())), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
        }
        return new e.Data(baseScaffoldData, labelC, arrayList);
    }
}
