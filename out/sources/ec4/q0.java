package ec4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lec4/q0;", "", "<init>", "()V", "Lez/a;", "currentTimeProvider", "Lfc4/b;", "b", "(Lez/a;)Lfc4/b;", "serverTimeLocalRepository", "Lac4/d;", "a", "(Lfc4/b;Lez/a;)Lac4/d;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0 {
    public final ac4.d a(fc4.b serverTimeLocalRepository, ez.a currentTimeProvider) {
        return new gc4.d(currentTimeProvider, serverTimeLocalRepository);
    }

    public final fc4.b b(ez.a currentTimeProvider) {
        return new dc4.a(currentTimeProvider);
    }
}
