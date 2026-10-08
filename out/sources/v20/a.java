package v20;

import fr.k;
import fr.t;
import j30.ButtonTextData;
import java.util.Date;
import oq.i0;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lv20/a;", "Lxw/f;", "Lv20/a$a;", "Lc30/b$b;", "a", "b", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends f<Params, c30.b.C0606b> {

    /* JADX INFO: renamed from: v20.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b!\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u0019\u0010\u0014R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001f\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lv20/a$a;", "", "Ljava/util/Date;", "date", "", "titleAfterExpirationDate", "titleOneDayBeforeExpirationDate", "titleBeforeExpirationDate", "bannerDescription", "Lkotlin/Function0;", "Loq/i0;", "onCloseButtonClick", "Lv20/a$b;", "updateButton", "<init>", "(Ljava/util/Date;IIIILer/a;Lv20/a$b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "b", "()Ljava/util/Date;", "I", "d", "c", "f", "e", "Ler/a;", "()Ler/a;", "g", "Lv20/a$b;", "()Lv20/a$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Date date;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int titleAfterExpirationDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int titleOneDayBeforeExpirationDate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int titleBeforeExpirationDate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int bannerDescription;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseButtonClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final b updateButton;

        public Params(Date date, int i15, int i16, int i17, int i18, er.a<i0> aVar, b bVar) {
            this.date = date;
            this.titleAfterExpirationDate = i15;
            this.titleOneDayBeforeExpirationDate = i16;
            this.titleBeforeExpirationDate = i17;
            this.bannerDescription = i18;
            this.onCloseButtonClick = aVar;
            this.updateButton = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getBannerDescription() {
            return this.bannerDescription;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Date getDate() {
            return this.date;
        }

        public final er.a<i0> c() {
            return this.onCloseButtonClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getTitleAfterExpirationDate() {
            return this.titleAfterExpirationDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getTitleBeforeExpirationDate() {
            return this.titleBeforeExpirationDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.date, params.date) && this.titleAfterExpirationDate == params.titleAfterExpirationDate && this.titleOneDayBeforeExpirationDate == params.titleOneDayBeforeExpirationDate && this.titleBeforeExpirationDate == params.titleBeforeExpirationDate && this.bannerDescription == params.bannerDescription && t.c(this.onCloseButtonClick, params.onCloseButtonClick) && t.c(this.updateButton, params.updateButton);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getTitleOneDayBeforeExpirationDate() {
            return this.titleOneDayBeforeExpirationDate;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final b getUpdateButton() {
            return this.updateButton;
        }

        public int hashCode() {
            Date date = this.date;
            return ((((((((((((date == null ? 0 : date.hashCode()) * 31) + Integer.hashCode(this.titleAfterExpirationDate)) * 31) + Integer.hashCode(this.titleOneDayBeforeExpirationDate)) * 31) + Integer.hashCode(this.titleBeforeExpirationDate)) * 31) + Integer.hashCode(this.bannerDescription)) * 31) + this.onCloseButtonClick.hashCode()) * 31) + this.updateButton.hashCode();
        }

        public String toString() {
            return "Params(date=" + this.date + ", titleAfterExpirationDate=" + this.titleAfterExpirationDate + ", titleOneDayBeforeExpirationDate=" + this.titleOneDayBeforeExpirationDate + ", titleBeforeExpirationDate=" + this.titleBeforeExpirationDate + ", bannerDescription=" + this.bannerDescription + ", onCloseButtonClick=" + this.onCloseButtonClick + ", updateButton=" + this.updateButton + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lv20/a$b;", "", "<init>", "()V", "b", "c", "a", "Lv20/a$b$a;", "Lv20/a$b$b;", "Lv20/a$b$c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: v20.a$b$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lv20/a$b$a;", "Lv20/a$b;", "Lj30/a;", "buttonData", "<init>", "(Lj30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj30/a;", "()Lj30/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class HideAfterExpiration extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f203320b = ButtonTextData.f99099f;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData buttonData;

            public HideAfterExpiration(ButtonTextData buttonTextData) {
                super(null);
                this.buttonData = buttonTextData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonTextData getButtonData() {
                return this.buttonData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HideAfterExpiration) && t.c(this.buttonData, ((HideAfterExpiration) other).buttonData);
            }

            public int hashCode() {
                return this.buttonData.hashCode();
            }

            public String toString() {
                return "HideAfterExpiration(buttonData=" + this.buttonData + ')';
            }
        }

        /* JADX INFO: renamed from: v20.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv20/a$b$b;", "Lv20/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C5289b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5289b f203322a = new C5289b();

            private C5289b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C5289b);
            }

            public int hashCode() {
                return -938601308;
            }

            public String toString() {
                return "HideAlways";
            }
        }

        /* JADX INFO: renamed from: v20.a$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lv20/a$b$c;", "Lv20/a$b;", "Lj30/a;", "buttonData", "<init>", "(Lj30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj30/a;", "()Lj30/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowAlways extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f203323b = ButtonTextData.f99099f;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData buttonData;

            public ShowAlways(ButtonTextData buttonTextData) {
                super(null);
                this.buttonData = buttonTextData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonTextData getButtonData() {
                return this.buttonData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowAlways) && t.c(this.buttonData, ((ShowAlways) other).buttonData);
            }

            public int hashCode() {
                return this.buttonData.hashCode();
            }

            public String toString() {
                return "ShowAlways(buttonData=" + this.buttonData + ')';
            }
        }

        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }
}
