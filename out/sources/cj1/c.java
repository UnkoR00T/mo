package cj1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n50.DefaultSingleCardData;
import oq.i0;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0004\u0007R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcj1/c;", "Ll00/e;", "Lcj1/c$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "b", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcj1/c$a;", "", "b", "c", "a", "Lcj1/c$a$a;", "Lcj1/c$a$b;", "Lcj1/c$a$c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: cj1.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcj1/c$a$a;", "Lcj1/c$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "d", "()Lhb4/c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcj1/c$a$b;", "Lcj1/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f27349a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 775563819;
            }

            public String toString() {
                return "Init";
            }
        }

        /* JADX INFO: renamed from: cj1.c$a$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcj1/c$a$c;", "Lcj1/c$a;", "Li50/a;", "b", "()Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBackClick", "Lh30/a;", "c", "()Lh30/a;", "registerButtonData", "Lcj1/c$a$c$a;", "Lcj1/c$a$c$b;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC0709c extends a {

            /* JADX INFO: renamed from: cj1.c$a$c$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b%\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b)\u0010-¨\u0006."}, d2 = {"Lcj1/c$a$c$a;", "Lcj1/c$a$c;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lh30/a;", "registerButtonData", "Lmx/a;", "header", "Lc30/b;", "alertData", "Lcj1/c$b;", "emptyInfoData", "<init>", "(Li50/a;Ler/a;Lh30/a;Lmx/a;Lc30/b;Lcj1/c$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Ler/a;", "()Ler/a;", "c", "Lh30/a;", "()Lh30/a;", "d", "Lmx/a;", "f", "()Lmx/a;", "e", "Lc30/b;", "()Lc30/b;", "Lcj1/c$b;", "()Lcj1/c$b;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Empty implements InterfaceC0709c {

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public static final int f27350g;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData baseScaffoldData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<i0> onBackClick;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final ButtonData registerButtonData;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label header;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final c30.b alertData;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final EmptyInfoData emptyInfoData;

                static {
                    int i15 = c30.b.f22944i;
                    f27350g = i15 | InfoRowListData.f187643b | i15 | BaseScaffoldData.f89350g;
                }

                public Empty(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, ButtonData buttonData, Label label, c30.b bVar, EmptyInfoData emptyInfoData) {
                    this.baseScaffoldData = baseScaffoldData;
                    this.onBackClick = aVar;
                    this.registerButtonData = buttonData;
                    this.header = label;
                    this.alertData = bVar;
                    this.emptyInfoData = emptyInfoData;
                }

                @Override // cj1.c.a.InterfaceC0709c
                public er.a<i0> a() {
                    return this.onBackClick;
                }

                @Override // cj1.c.a.InterfaceC0709c
                /* JADX INFO: renamed from: b, reason: from getter */
                public BaseScaffoldData getBaseScaffoldData() {
                    return this.baseScaffoldData;
                }

                @Override // cj1.c.a.InterfaceC0709c
                /* JADX INFO: renamed from: c, reason: from getter */
                public ButtonData getRegisterButtonData() {
                    return this.registerButtonData;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public c30.b getAlertData() {
                    return this.alertData;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final EmptyInfoData getEmptyInfoData() {
                    return this.emptyInfoData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Empty)) {
                        return false;
                    }
                    Empty empty = (Empty) other;
                    return fr.t.c(this.baseScaffoldData, empty.baseScaffoldData) && fr.t.c(this.onBackClick, empty.onBackClick) && fr.t.c(this.registerButtonData, empty.registerButtonData) && fr.t.c(this.header, empty.header) && fr.t.c(this.alertData, empty.alertData) && fr.t.c(this.emptyInfoData, empty.emptyInfoData);
                }

                /* JADX INFO: renamed from: f, reason: from getter */
                public Label getHeader() {
                    return this.header;
                }

                public int hashCode() {
                    int iHashCode = ((this.baseScaffoldData.hashCode() * 31) + this.onBackClick.hashCode()) * 31;
                    ButtonData buttonData = this.registerButtonData;
                    int iHashCode2 = (((iHashCode + (buttonData == null ? 0 : buttonData.hashCode())) * 31) + this.header.hashCode()) * 31;
                    c30.b bVar = this.alertData;
                    int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                    EmptyInfoData emptyInfoData = this.emptyInfoData;
                    return iHashCode3 + (emptyInfoData != null ? emptyInfoData.hashCode() : 0);
                }

                public String toString() {
                    return "Empty(baseScaffoldData=" + this.baseScaffoldData + ", onBackClick=" + this.onBackClick + ", registerButtonData=" + this.registerButtonData + ", header=" + this.header + ", alertData=" + this.alertData + ", emptyInfoData=" + this.emptyInfoData + ')';
                }
            }

            /* JADX INFO: renamed from: cj1.c$a$c$b, reason: from toString */
            @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b*\u0010.¨\u0006/"}, d2 = {"Lcj1/c$a$c$b;", "Lcj1/c$a$c;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lh30/a;", "registerButtonData", "Lmx/a;", "header", "Lc30/b;", "alertData", "", "Ln50/g;", "cardList", "<init>", "(Li50/a;Ler/a;Lh30/a;Lmx/a;Lc30/b;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Ler/a;", "()Ler/a;", "c", "Lh30/a;", "()Lh30/a;", "d", "Lmx/a;", "f", "()Lmx/a;", "e", "Lc30/b;", "()Lc30/b;", "Ljava/util/List;", "()Ljava/util/List;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class List implements InterfaceC0709c {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData baseScaffoldData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<i0> onBackClick;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final ButtonData registerButtonData;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label header;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final c30.b alertData;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final java.util.List<DefaultSingleCardData> cardList;

                public List(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, ButtonData buttonData, Label label, c30.b bVar, java.util.List<DefaultSingleCardData> list) {
                    this.baseScaffoldData = baseScaffoldData;
                    this.onBackClick = aVar;
                    this.registerButtonData = buttonData;
                    this.header = label;
                    this.alertData = bVar;
                    this.cardList = list;
                }

                @Override // cj1.c.a.InterfaceC0709c
                public er.a<i0> a() {
                    return this.onBackClick;
                }

                @Override // cj1.c.a.InterfaceC0709c
                /* JADX INFO: renamed from: b, reason: from getter */
                public BaseScaffoldData getBaseScaffoldData() {
                    return this.baseScaffoldData;
                }

                @Override // cj1.c.a.InterfaceC0709c
                /* JADX INFO: renamed from: c, reason: from getter */
                public ButtonData getRegisterButtonData() {
                    return this.registerButtonData;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public c30.b getAlertData() {
                    return this.alertData;
                }

                public final java.util.List<DefaultSingleCardData> e() {
                    return this.cardList;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof List)) {
                        return false;
                    }
                    List list = (List) other;
                    return fr.t.c(this.baseScaffoldData, list.baseScaffoldData) && fr.t.c(this.onBackClick, list.onBackClick) && fr.t.c(this.registerButtonData, list.registerButtonData) && fr.t.c(this.header, list.header) && fr.t.c(this.alertData, list.alertData) && fr.t.c(this.cardList, list.cardList);
                }

                /* JADX INFO: renamed from: f, reason: from getter */
                public Label getHeader() {
                    return this.header;
                }

                public int hashCode() {
                    int iHashCode = ((this.baseScaffoldData.hashCode() * 31) + this.onBackClick.hashCode()) * 31;
                    ButtonData buttonData = this.registerButtonData;
                    int iHashCode2 = (((iHashCode + (buttonData == null ? 0 : buttonData.hashCode())) * 31) + this.header.hashCode()) * 31;
                    c30.b bVar = this.alertData;
                    return ((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.cardList.hashCode();
                }

                public String toString() {
                    return "List(baseScaffoldData=" + this.baseScaffoldData + ", onBackClick=" + this.onBackClick + ", registerButtonData=" + this.registerButtonData + ", header=" + this.header + ", alertData=" + this.alertData + ", cardList=" + this.cardList + ')';
                }
            }

            er.a<i0> a();

            /* JADX INFO: renamed from: b */
            BaseScaffoldData getBaseScaffoldData();

            /* JADX INFO: renamed from: c */
            ButtonData getRegisterButtonData();
        }
    }

    /* JADX INFO: renamed from: cj1.c$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcj1/c$b;", "", "Lmx/a;", "description", "Lt40/b;", "infoRowListData", "Lc30/b;", "infoAlertData", "<init>", "(Lmx/a;Lt40/b;Lc30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Lt40/b;", "c", "()Lt40/b;", "Lc30/b;", "()Lc30/b;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmptyInfoData {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f27363d = c30.b.f22944i | InfoRowListData.f187643b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InfoRowListData infoRowListData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b infoAlertData;

        public EmptyInfoData(Label label, InfoRowListData infoRowListData, c30.b bVar) {
            this.description = label;
            this.infoRowListData = infoRowListData;
            this.infoAlertData = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c30.b getInfoAlertData() {
            return this.infoAlertData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InfoRowListData getInfoRowListData() {
            return this.infoRowListData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmptyInfoData)) {
                return false;
            }
            EmptyInfoData emptyInfoData = (EmptyInfoData) other;
            return fr.t.c(this.description, emptyInfoData.description) && fr.t.c(this.infoRowListData, emptyInfoData.infoRowListData) && fr.t.c(this.infoAlertData, emptyInfoData.infoAlertData);
        }

        public int hashCode() {
            return (((this.description.hashCode() * 31) + this.infoRowListData.hashCode()) * 31) + this.infoAlertData.hashCode();
        }

        public String toString() {
            return "EmptyInfoData(description=" + this.description + ", infoRowListData=" + this.infoRowListData + ", infoAlertData=" + this.infoAlertData + ')';
        }
    }

    oz.j a();
}
