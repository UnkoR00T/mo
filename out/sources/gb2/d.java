package gb2;

import fr.t;
import i50.BaseScaffoldData;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgb2/d;", "Lxw/f;", "Lgb2/d$a;", "Lgb2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lel0/a;", "status", "Lq40/g;", "", "c", "(Lel0/a;)Lq40/g;", "params", "e", "(Lgb2/d$a;)Lgb2/c$a;", "a", "Lmx/c;", "idcardcollecting_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gb2.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgb2/d$a;", "", "Lgb2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Lgb2/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgb2/b;", "b", "()Lgb2/b;", "Ler/a;", "()Ler/a;", "idcardcollecting_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final gb2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(gb2.b bVar, er.a<i0> aVar) {
            this.state = bVar;
            this.onBackAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final gb2.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71596a;

        static {
            int[] iArr = new int[el0.a.values().length];
            try {
                iArr[el0.a.APPLICATION_PROCESSED_AT_OFFICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[el0.a.APPLICATION_PROCESSED_TO_COMPLETE_AT_OFFICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[el0.a.ID_CARD_IN_PRODUCTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[el0.a.APPLICATION_SUSPENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[el0.a.APPLICATION_REJECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[el0.a.ID_CARD_FOR_COLLECTION_WITHOUT_PUK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[el0.a.ID_CARD_FOR_COLLECTION_WITH_PUK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[el0.a.ID_CARD_COLLECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[el0.a.ID_CARD_COLLECTED_WAIT_FOR_PUK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[el0.a.ID_CARD_COLLECTED_GET_PUK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[el0.a.ID_CARD_CANNOT_BE_ISSUED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[el0.a.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[el0.a.APPLICATION_NOT_FOUND.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f71596a = iArr;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final IconPageData c(el0.a status) {
        switch (b.f71596a[status.ordinal()]) {
            case 1:
                return new IconPageData(q40.j.b.C4090b.f164686d, this.labelProvider.c(za2.a.f233992w), null, null, null, null, false, 76, null);
            case 2:
                return new IconPageData(q40.j.b.d.f164690d, this.labelProvider.c(za2.a.f233995z), this.labelProvider.c(za2.a.f233993x), this.labelProvider.c(za2.a.f233994y), null, null, false, 64, null);
            case 3:
                return new IconPageData(q40.j.b.C4090b.f164686d, this.labelProvider.c(za2.a.f233990u), this.labelProvider.c(za2.a.f233989t), null, null, null, false, 72, null);
            case 4:
                return new IconPageData(q40.j.b.a.f164684d, this.labelProvider.c(za2.a.B), this.labelProvider.c(za2.a.f233988s), null, null, null, false, 72, null);
            case 5:
                return new IconPageData(q40.j.b.a.f164684d, this.labelProvider.c(za2.a.A), this.labelProvider.c(za2.a.f233988s), null, null, null, false, 72, null);
            case 6:
                return new IconPageData(q40.j.b.c.f164688d, this.labelProvider.c(za2.a.f233987r), this.labelProvider.c(za2.a.f233985p), this.labelProvider.c(za2.a.f233986q), null, null, false, 64, null);
            case 7:
                return new IconPageData(q40.j.b.c.f164688d, this.labelProvider.c(za2.a.f233984o), this.labelProvider.c(za2.a.f233982m), this.labelProvider.c(za2.a.f233983n), null, null, false, 64, null);
            case 8:
                return new IconPageData(q40.j.b.c.f164688d, this.labelProvider.c(za2.a.f233978i), null, null, null, null, false, 76, null);
            case 9:
                return new IconPageData(q40.j.b.c.f164688d, this.labelProvider.c(za2.a.f233981l), this.labelProvider.c(za2.a.f233979j), this.labelProvider.c(za2.a.f233980k), null, null, false, 64, null);
            case 10:
                return new IconPageData(q40.j.b.c.f164688d, this.labelProvider.c(za2.a.f233977h), this.labelProvider.c(za2.a.f233976g), null, null, null, false, 72, null);
            case 11:
                return new IconPageData(q40.j.b.a.f164684d, this.labelProvider.c(za2.a.f233975f), this.labelProvider.c(za2.a.f233988s), null, null, null, false, 72, null);
            case 12:
            case 13:
                return new IconPageData(q40.j.b.a.f164684d, this.labelProvider.c(za2.a.f233991v), null, null, null, null, false, 76, null);
            default:
                throw new oq.p();
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        gb2.b state = params.getState();
        if (state instanceof gb2.b.Initial) {
            return c.a.C1634a.f71589a;
        }
        if (!(state instanceof gb2.b.Result)) {
            throw new oq.p();
        }
        return new c.a.Result(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(za2.a.C), null, null, null, 28, null), null, null, null, null, 61, null), c(((gb2.b.Result) params.getState()).getStatus()), params.a());
    }
}
