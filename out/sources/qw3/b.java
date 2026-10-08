package qw3;

import mu.p0;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\rR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lqw3/b;", "", "", "width", "height", "Loq/i0;", "b", "(FF)V", "", "angle", "f", "(I)V", "c", "()V", "Lm3/e;", "centroid", "pan", "zoom", "e", "(JJF)V", "a", "Lmu/p0;", "Lqw3/i;", "getState", "()Lmu/p0;", "state", "Lmx/a;", "d", "rotateValuePopupInfo", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@oq.a
public interface b {
    void a();

    void b(float width, float height);

    void c();

    p0<Label> d();

    void e(long centroid, long pan, float zoom);

    void f(int angle);

    p0<State> getState();
}
