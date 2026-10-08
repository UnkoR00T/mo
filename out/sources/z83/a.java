package z83;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import mx.c;
import oo0.Topic;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import t40.InfoRowListData;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y83.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0018\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u0004\u0018\u00010\f*\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lz83/a;", "Lxw/f;", "Lz83/a$a;", "Ly83/e$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "Loo0/u$b;", "Lkotlin/Function1;", "", "Loq/i0;", "onInfoLinkButtonClick", "Lx40/a;", "l", "(Loo0/u$b;Ler/l;)Lx40/a;", "Lmx/a;", "e", "(Loo0/u$b;)Lmx/a;", "Lt40/b;", "f", "(Loo0/u$b;)Lt40/b;", "topicType", "", "linkLabelResId", "c", "(Ler/l;Loo0/u$b;I)Lx40/a;", "h", "(Loo0/u$b;)Ljava/lang/String;", "params", "i", "(Lz83/a$a;)Ly83/e$a;", "a", "Lmx/c;", "b", "Lu04/a;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: z83.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lz83/a$a;", "", "Loo0/u;", "topic", "Lkotlin/Function1;", "", "Loq/i0;", "onInfoLinkButtonClick", "Lkotlin/Function0;", "onClose", "<init>", "(Loo0/u;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loo0/u;", "c", "()Loo0/u;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Topic topic;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onInfoLinkButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(Topic topic, l<? super String, i0> lVar, er.a<i0> aVar) {
            this.topic = topic;
            this.onInfoLinkButtonClick = lVar;
            this.onClose = aVar;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        public final l<String, i0> b() {
            return this.onInfoLinkButtonClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Topic getTopic() {
            return this.topic;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.topic, params.topic) && t.c(this.onInfoLinkButtonClick, params.onInfoLinkButtonClick) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (((this.topic.hashCode() * 31) + this.onInfoLinkButtonClick.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(topic=" + this.topic + ", onInfoLinkButtonClick=" + this.onInfoLinkButtonClick + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f233379a;

        static {
            int[] iArr = new int[Topic.b.values().length];
            try {
                iArr[Topic.b.FAMILY_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Topic.b.ADVOCATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Topic.b.NURSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Topic.b.MIDWIFE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Topic.b.MEDICAL_PRESCRIPTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Topic.b.PENALTY_POINTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Topic.b.DENTIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Topic.b.DOCTOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Topic.b.MOBILE_ID_CARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Topic.b.TRUSTED_PROFILE_BANKING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Topic.b.DRIVING_LICENCE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Topic.b.VEHICLE_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Topic.b.SCHOOL_STUDENT_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Topic.b.UNIVERSITY_STUDENT_CARD.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Topic.b.TRAIN_TICKETS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Topic.b.MKA_CARD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f233379a = iArr;
        }
    }

    public a(c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    private final LinkData c(l<? super String, i0> onInfoLinkButtonClick, Topic.b topicType, int linkLabelResId) {
        String strH = h(topicType);
        if (strH != null) {
            return new LinkData(null, this.labelProvider.c(linkLabelResId), strH, LinkData.EnumC5775a.WEBSITE, false, onInfoLinkButtonClick, 17, null);
        }
        return null;
    }

    private final Label e(Topic.b bVar) {
        switch (b.f233379a[bVar.ordinal()]) {
            case 1:
                return this.labelProvider.c(l83.a.W);
            case 2:
                return this.labelProvider.c(l83.a.f116996o);
            case 3:
                return this.labelProvider.c(l83.a.f116985i0);
            case 4:
                return this.labelProvider.c(l83.a.f116985i0);
            case 5:
                return this.labelProvider.c(l83.a.T);
            case 6:
                return this.labelProvider.c(l83.a.f116991l0);
            case 7:
                return this.labelProvider.c(l83.a.D);
            case 8:
                return this.labelProvider.c(l83.a.D);
            case 9:
                return this.labelProvider.c(l83.a.f116973c0);
            case 10:
                return this.labelProvider.c(l83.a.f117002r);
            case 11:
                return this.labelProvider.c(l83.a.G);
            case 12:
                return this.labelProvider.c(l83.a.f116971b0);
            case 13:
                return this.labelProvider.c(l83.a.f116999p0);
            case 14:
                return this.labelProvider.c(l83.a.f117011v0);
            case 15:
                return this.labelProvider.c(l83.a.f117008u);
            case 16:
                return this.labelProvider.c(l83.a.f116981g0);
            default:
                return null;
        }
    }

    private final InfoRowListData f(Topic.b bVar) {
        switch (b.f233379a[bVar.ordinal()]) {
            case 1:
                return new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(l83.a.Y)), new t40.a.C4874a(this.labelProvider.c(l83.a.Z)), new t40.a.C4874a(this.labelProvider.c(l83.a.f116969a0))));
            case 2:
                return new InfoRowListData(v.e(new t40.a.C4874a(this.labelProvider.c(l83.a.f117000q))));
            case 3:
                return new InfoRowListData(v.e(new t40.a.C4874a(this.labelProvider.c(l83.a.f116989k0))));
            case 4:
                return new InfoRowListData(v.e(new t40.a.C4874a(this.labelProvider.c(l83.a.f116989k0))));
            case 5:
                return new InfoRowListData(v.e(new t40.a.C4874a(this.labelProvider.c(l83.a.V))));
            case 6:
                return new InfoRowListData(v.e(new t40.a.C4874a(this.labelProvider.c(l83.a.f116995n0))));
            case 7:
                return new InfoRowListData(v.e(new t40.a.C4874a(this.labelProvider.c(l83.a.F))));
            case 8:
                return new InfoRowListData(v.e(new t40.a.C4874a(this.labelProvider.c(l83.a.F))));
            case 9:
                return new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(l83.a.f116975d0)), new t40.a.C4874a(this.labelProvider.c(l83.a.f116977e0))));
            case 10:
                return new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(l83.a.f117004s)), new t40.a.C4874a(this.labelProvider.c(l83.a.f117006t))));
            case 11:
                return new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(l83.a.H)), new t40.a.C4874a(this.labelProvider.c(l83.a.I)), new t40.a.C4874a(this.labelProvider.c(l83.a.J))));
            case 12:
                return new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(l83.a.F0)), new t40.a.C4874a(this.labelProvider.c(l83.a.G0))));
            case 13:
                return new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(l83.a.f117001q0)), new t40.a.C4874a(this.labelProvider.c(l83.a.f117003r0)), new t40.a.C4874a(this.labelProvider.c(l83.a.f117005s0)), new t40.a.C4874a(this.labelProvider.c(l83.a.f117007t0))));
            case 14:
                return new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(l83.a.f117013w0)), new t40.a.C4874a(this.labelProvider.c(l83.a.f117015x0)), new t40.a.C4874a(this.labelProvider.c(l83.a.f117017y0)), new t40.a.C4874a(this.labelProvider.c(l83.a.f117019z0))));
            case 15:
                return new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(l83.a.f117010v)), new t40.a.C4874a(this.labelProvider.c(l83.a.f117012w))));
            case 16:
                return new InfoRowListData(v.e(new t40.a.C4874a(this.labelProvider.c(l83.a.f116983h0))));
            default:
                return null;
        }
    }

    private final String h(Topic.b bVar) {
        switch (b.f233379a[bVar.ordinal()]) {
            case 1:
                return this.commonEndpoints.b();
            case 2:
                return this.commonEndpoints.n();
            case 3:
            case 4:
                return this.commonEndpoints.x();
            case 5:
                return this.commonEndpoints.q();
            case 6:
                return this.commonEndpoints.D();
            case 7:
            case 8:
                return this.commonEndpoints.u();
            default:
                return null;
        }
    }

    private final LinkData l(Topic.b bVar, l<? super String, i0> lVar) {
        switch (b.f233379a[bVar.ordinal()]) {
            case 1:
                return c(lVar, bVar, l83.a.X);
            case 2:
                return c(lVar, bVar, l83.a.f116998p);
            case 3:
                return c(lVar, bVar, l83.a.f116987j0);
            case 4:
                return c(lVar, bVar, l83.a.f116987j0);
            case 5:
                return c(lVar, bVar, l83.a.U);
            case 6:
                return c(lVar, bVar, l83.a.f116993m0);
            case 7:
                return c(lVar, bVar, l83.a.E);
            case 8:
                return c(lVar, bVar, l83.a.E);
            default:
                return null;
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        return new e.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), mx.b.b(params.getTopic().getLabel(), "reportTopicInfoPageTitle"), null, null, null, 28, null), null, null, null, null, 61, null), e(params.getTopic().getType()), f(params.getTopic().getType()), l(params.getTopic().getType(), params.b()));
    }
}
