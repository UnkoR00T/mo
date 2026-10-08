package ak2;

import e60.FooterData;
import j30.ButtonTextData;
import l20.GreetingsHeaderData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lak2/c;", "Ll00/e;", "Lak2/c$a;", "a", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: ak2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0018\u0010'¨\u0006("}, d2 = {"Lak2/c$a;", "", "Ll20/a;", "greetingsHeaderData", "Lj30/a;", "passwordLoginButtonTextData", "Lv50/c;", "pinTextInputData", "", "shouldFocusWithKeyboard", "isImeVisible", "Le60/a;", "footerData", "<init>", "(Ll20/a;Lj30/a;Lv50/c;ZZLe60/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ll20/a;", "b", "()Ll20/a;", "Lj30/a;", "c", "()Lj30/a;", "Lv50/c;", "d", "()Lv50/c;", "Z", "e", "()Z", "f", "Le60/a;", "()Le60/a;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f7164g = ((FooterData.f47642h | v50.c.f203957t) | ButtonTextData.f99099f) | GreetingsHeaderData.f115424c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final GreetingsHeaderData greetingsHeaderData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonTextData passwordLoginButtonTextData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c pinTextInputData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldFocusWithKeyboard;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isImeVisible;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final FooterData footerData;

        public Data(GreetingsHeaderData greetingsHeaderData, ButtonTextData buttonTextData, v50.c cVar, boolean z15, boolean z16, FooterData footerData) {
            this.greetingsHeaderData = greetingsHeaderData;
            this.passwordLoginButtonTextData = buttonTextData;
            this.pinTextInputData = cVar;
            this.shouldFocusWithKeyboard = z15;
            this.isImeVisible = z16;
            this.footerData = footerData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FooterData getFooterData() {
            return this.footerData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final GreetingsHeaderData getGreetingsHeaderData() {
            return this.greetingsHeaderData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ButtonTextData getPasswordLoginButtonTextData() {
            return this.passwordLoginButtonTextData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final v50.c getPinTextInputData() {
            return this.pinTextInputData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getShouldFocusWithKeyboard() {
            return this.shouldFocusWithKeyboard;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.greetingsHeaderData, data.greetingsHeaderData) && fr.t.c(this.passwordLoginButtonTextData, data.passwordLoginButtonTextData) && fr.t.c(this.pinTextInputData, data.pinTextInputData) && this.shouldFocusWithKeyboard == data.shouldFocusWithKeyboard && this.isImeVisible == data.isImeVisible && fr.t.c(this.footerData, data.footerData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsImeVisible() {
            return this.isImeVisible;
        }

        public int hashCode() {
            return (((((((((this.greetingsHeaderData.hashCode() * 31) + this.passwordLoginButtonTextData.hashCode()) * 31) + this.pinTextInputData.hashCode()) * 31) + Boolean.hashCode(this.shouldFocusWithKeyboard)) * 31) + Boolean.hashCode(this.isImeVisible)) * 31) + this.footerData.hashCode();
        }

        public String toString() {
            return "Data(greetingsHeaderData=" + this.greetingsHeaderData + ", passwordLoginButtonTextData=" + this.passwordLoginButtonTextData + ", pinTextInputData=" + this.pinTextInputData + ", shouldFocusWithKeyboard=" + this.shouldFocusWithKeyboard + ", isImeVisible=" + this.isImeVisible + ", footerData=" + this.footerData + ')';
        }
    }
}
