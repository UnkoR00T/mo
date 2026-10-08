package p30;

import androidx.compose.ui.graphics.Color;
import i30.ButtonIconData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lp30/x;", "", "<init>", "()V", "Li30/a;", "a", "()Li30/a;", "buttonData", "b", "Lp30/x$a;", "Lp30/x$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class x {

    /* JADX INFO: renamed from: p30.x$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001b"}, d2 = {"Lp30/x$a;", "Lp30/x;", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "getOnClick", "()Ler/a;", "Li30/a;", "b", "Li30/a;", "()Li30/a;", "buttonData", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Share extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClick;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ButtonIconData buttonData;

        /* JADX INFO: renamed from: p30.x$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3751a implements er.p<p076m2.r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3751a f152671a = new C3751a();

            C3751a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(p076m2.r rVar, int i15) {
                rVar.X(2063824684);
                if (p076m2.t.k()) {
                    p076m2.t.o(2063824684, i15, -1, "pl.gov.coi.common.ui.ds.chatbubble.FooterActionData.Share.buttonData.<anonymous> (ChatBubbleData.kt:73)");
                }
                long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return jB;
            }
        }

        public Share(er.a<i0> aVar) {
            super(null);
            this.onClick = aVar;
            this.buttonData = new ButtonIconData(null, jz.a.f106743c, C3751a.f152671a, null, c70.a.f23835a.a().D(), aVar, 9, null);
        }

        @Override // p30.x
        /* JADX INFO: renamed from: a, reason: from getter */
        public ButtonIconData getButtonData() {
            return this.buttonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Share) && fr.t.c(this.onClick, ((Share) other).onClick);
        }

        public int hashCode() {
            return this.onClick.hashCode();
        }

        public String toString() {
            return "Share(onClick=" + this.onClick + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\r\tB%\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\t\u0010\u0014\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lp30/x$b;", "Lp30/x;", "", "isSelected", "Lkotlin/Function1;", "Loq/i0;", "onToggle", "<init>", "(ZLer/l;)V", "a", "Z", "g", "()Z", "b", "Ler/l;", "f", "()Ler/l;", "Li30/a;", "c", "Loq/k;", "()Li30/a;", "buttonData", "Lp30/x$b$a;", "Lp30/x$b$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isSelected;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final er.l<Boolean, i0> onToggle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final oq.k buttonData;

        /* JADX INFO: renamed from: p30.x$b$a, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lp30/x$b$a;", "Lp30/x$b;", "", "isSelected", "Lkotlin/Function1;", "Loq/i0;", "onToggle", "<init>", "(ZLer/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Z", "g", "()Z", "e", "Ler/l;", "f", "()Ler/l;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NegativeRate extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isSelected;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<Boolean, i0> onToggle;

            /* JADX WARN: Multi-variable type inference failed */
            public NegativeRate(boolean z15, er.l<? super Boolean, i0> lVar) {
                super(z15, lVar, null);
                this.isSelected = z15;
                this.onToggle = lVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NegativeRate)) {
                    return false;
                }
                NegativeRate negativeRate = (NegativeRate) other;
                return this.isSelected == negativeRate.isSelected && fr.t.c(this.onToggle, negativeRate.onToggle);
            }

            @Override // p30.x.b
            public er.l<Boolean, i0> f() {
                return this.onToggle;
            }

            @Override // p30.x.b
            /* JADX INFO: renamed from: g, reason: from getter */
            public boolean getIsSelected() {
                return this.isSelected;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isSelected) * 31) + this.onToggle.hashCode();
            }

            public String toString() {
                return "NegativeRate(isSelected=" + this.isSelected + ", onToggle=" + this.onToggle + ')';
            }
        }

        /* JADX INFO: renamed from: p30.x$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lp30/x$b$b;", "Lp30/x$b;", "", "isSelected", "Lkotlin/Function1;", "Loq/i0;", "onToggle", "<init>", "(ZLer/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Z", "g", "()Z", "e", "Ler/l;", "f", "()Ler/l;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PositiveRate extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isSelected;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<Boolean, i0> onToggle;

            /* JADX WARN: Multi-variable type inference failed */
            public PositiveRate(boolean z15, er.l<? super Boolean, i0> lVar) {
                super(z15, lVar, null);
                this.isSelected = z15;
                this.onToggle = lVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PositiveRate)) {
                    return false;
                }
                PositiveRate positiveRate = (PositiveRate) other;
                return this.isSelected == positiveRate.isSelected && fr.t.c(this.onToggle, positiveRate.onToggle);
            }

            @Override // p30.x.b
            public er.l<Boolean, i0> f() {
                return this.onToggle;
            }

            @Override // p30.x.b
            /* JADX INFO: renamed from: g, reason: from getter */
            public boolean getIsSelected() {
                return this.isSelected;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isSelected) * 31) + this.onToggle.hashCode();
            }

            public String toString() {
                return "PositiveRate(isSelected=" + this.isSelected + ", onToggle=" + this.onToggle + ')';
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c implements er.p<p076m2.r, Integer, Color> {
            c() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(p076m2.r rVar, int i15) {
                long jB;
                rVar.X(1010079823);
                if (p076m2.t.k()) {
                    p076m2.t.o(1010079823, i15, -1, "pl.gov.coi.common.ui.ds.chatbubble.FooterActionData.Toggleable.buttonData$delegate.<anonymous>.<anonymous> (ChatBubbleData.kt:87)");
                }
                if (b.this.getIsSelected()) {
                    rVar.X(24103350);
                    jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
                    rVar.R();
                } else {
                    rVar.X(24105017);
                    jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                    rVar.R();
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return jB;
            }
        }

        public /* synthetic */ b(boolean z15, er.l lVar, fr.k kVar) {
            this(z15, lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ButtonIconData d(final b bVar) {
            return new ButtonIconData(null, p30.b.d(bVar), bVar.new c(), null, p30.b.c(bVar), new er.a() { // from class: p30.z
                @Override // er.a
                public final Object a() {
                    return x.b.e(this.f152681a);
                }
            }, 9, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 e(b bVar) {
            bVar.f().b(Boolean.valueOf(!bVar.getIsSelected()));
            return i0.f148189a;
        }

        @Override // p30.x
        /* JADX INFO: renamed from: a */
        public ButtonIconData getButtonData() {
            return (ButtonIconData) this.buttonData.getValue();
        }

        public abstract er.l<Boolean, i0> f();

        /* JADX INFO: renamed from: g */
        public abstract boolean getIsSelected();

        /* JADX WARN: Multi-variable type inference failed */
        private b(boolean z15, er.l<? super Boolean, i0> lVar) {
            super(null);
            this.isSelected = z15;
            this.onToggle = lVar;
            this.buttonData = oq.l.a(new er.a() { // from class: p30.y
                @Override // er.a
                public final Object a() {
                    return x.b.d(this.f152680a);
                }
            });
        }
    }

    public /* synthetic */ x(fr.k kVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract ButtonIconData getButtonData();

    private x() {
    }
}
