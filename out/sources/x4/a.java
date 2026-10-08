package x4;

import android.os.LocaleList;
import java.util.ArrayList;
import p071kotlin.Metadata;
import y4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lx4/a;", "Lx4/f;", "<init>", "()V", "Landroid/os/LocaleList;", "a", "Landroid/os/LocaleList;", "lastPlatformLocaleList", "Lx4/d;", "b", "Lx4/d;", "lastLocaleList", "Ly4/t;", "c", "Ly4/t;", "lock", "()Lx4/d;", "current", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private LocaleList lastPlatformLocaleList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private LocaleList lastLocaleList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t lock = new t();

    @Override // x4.f
    public LocaleList a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.lock) {
            LocaleList localeList2 = this.lastLocaleList;
            if (localeList2 != null && localeList == this.lastPlatformLocaleList) {
                return localeList2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i15 = 0; i15 < size; i15++) {
                arrayList.add(new c(localeList.get(i15)));
            }
            LocaleList localeList3 = new LocaleList(arrayList);
            this.lastPlatformLocaleList = localeList;
            this.lastLocaleList = localeList3;
            return localeList3;
        }
    }
}
