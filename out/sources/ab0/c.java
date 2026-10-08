package ab0;

import fr.t;
import i50.BaseScaffoldData;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lab0/c;", "Ll00/e;", "Lab0/c$a;", "a", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lab0/c$a;", "", "a", "Lab0/c$a$a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ab0.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lab0/c$a$a;", "Lab0/c$a;", "Li50/a;", "scaffoldData", "Ln30/b;", "settingsList", "Ln50/k;", "logoutItem", "<init>", "(Li50/a;Ln30/b;Ln50/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Ln30/b;", "c", "()Ln30/b;", "Ln50/k;", "()Ln50/k;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SettingsData implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData settingsList;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k logoutItem;

            public SettingsData(BaseScaffoldData baseScaffoldData, CardListData cardListData, n50.k kVar) {
                this.scaffoldData = baseScaffoldData;
                this.settingsList = cardListData;
                this.logoutItem = kVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final n50.k getLogoutItem() {
                return this.logoutItem;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CardListData getSettingsList() {
                return this.settingsList;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SettingsData)) {
                    return false;
                }
                SettingsData settingsData = (SettingsData) other;
                return t.c(this.scaffoldData, settingsData.scaffoldData) && t.c(this.settingsList, settingsData.settingsList) && t.c(this.logoutItem, settingsData.logoutItem);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.settingsList.hashCode()) * 31) + this.logoutItem.hashCode();
            }

            public String toString() {
                return "SettingsData(scaffoldData=" + this.scaffoldData + ", settingsList=" + this.settingsList + ", logoutItem=" + this.logoutItem + ')';
            }
        }
    }
}
