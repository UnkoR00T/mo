package e6;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f47636a;

    j(Object obj) {
        this.f47636a = (LocaleList) obj;
    }

    @Override // e6.i
    public String a() {
        return this.f47636a.toLanguageTags();
    }

    public boolean equals(Object obj) {
        return this.f47636a.equals(((i) obj).getLocaleList());
    }

    @Override // e6.i
    public Locale get(int i15) {
        return this.f47636a.get(i15);
    }

    @Override // e6.i
    public Object getLocaleList() {
        return this.f47636a;
    }

    public int hashCode() {
        return this.f47636a.hashCode();
    }

    @Override // e6.i
    public boolean isEmpty() {
        return this.f47636a.isEmpty();
    }

    @Override // e6.i
    public int size() {
        return this.f47636a.size();
    }

    public String toString() {
        return this.f47636a.toString();
    }
}
