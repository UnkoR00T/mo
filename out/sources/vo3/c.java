package vo3;

import i50.BaseScaffoldData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lvo3/c;", "Ll00/e;", "Lvo3/c$a;", "a", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lvo3/c$a;", "", "a", "b", "Lvo3/c$a$a;", "Lvo3/c$a$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: vo3.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvo3/c$a$a;", "Lvo3/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C5457a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5457a f207723a = new C5457a();

            private C5457a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C5457a);
            }

            public int hashCode() {
                return 483644901;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: vo3.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b$\u0010(¨\u0006)"}, d2 = {"Lvo3/c$a$b;", "Lx60/d;", "Lvo3/c$a;", "Li50/a;", "baseScaffoldData", "Lo40/a;", "headerData", "Lkotlin/Function0;", "Loq/i0;", "onCloseButtonClicked", "Lv50/c$e;", "pinInputData", "", "shouldFocusWithKeyboard", "<init>", "(Li50/a;Lo40/a;Ler/a;Lv50/c$e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lo40/a;", "()Lo40/a;", "c", "Ler/a;", "e", "()Ler/a;", "d", "Lv50/c$e;", "()Lv50/c$e;", "Z", "()Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements x60.d, a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a headerData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onCloseButtonClicked;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c.Pin pinInputData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldFocusWithKeyboard;

            public Initialized(BaseScaffoldData baseScaffoldData, o40.a aVar, er.a<i0> aVar2, v50.c.Pin pin, boolean z15) {
                this.baseScaffoldData = baseScaffoldData;
                this.headerData = aVar;
                this.onCloseButtonClicked = aVar2;
                this.pinInputData = pin;
                this.shouldFocusWithKeyboard = z15;
            }

            @Override // x60.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public o40.a getHeaderData() {
                return this.headerData;
            }

            @Override // x60.d
            /* JADX INFO: renamed from: b, reason: from getter */
            public BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            @Override // x60.d
            /* JADX INFO: renamed from: c, reason: from getter */
            public v50.c.Pin getPinInputData() {
                return this.pinInputData;
            }

            @Override // x60.d
            /* JADX INFO: renamed from: d, reason: from getter */
            public boolean getShouldFocusWithKeyboard() {
                return this.shouldFocusWithKeyboard;
            }

            public er.a<i0> e() {
                return this.onCloseButtonClicked;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.headerData, initialized.headerData) && fr.t.c(this.onCloseButtonClicked, initialized.onCloseButtonClicked) && fr.t.c(this.pinInputData, initialized.pinInputData) && this.shouldFocusWithKeyboard == initialized.shouldFocusWithKeyboard;
            }

            public int hashCode() {
                return (((((((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.onCloseButtonClicked.hashCode()) * 31) + this.pinInputData.hashCode()) * 31) + Boolean.hashCode(this.shouldFocusWithKeyboard);
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", onCloseButtonClicked=" + this.onCloseButtonClicked + ", pinInputData=" + this.pinInputData + ", shouldFocusWithKeyboard=" + this.shouldFocusWithKeyboard + ')';
            }
        }
    }
}
