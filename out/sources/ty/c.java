package ty;

import mu.b0;
import p071kotlin.Metadata;
import p076m2.r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u00020\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lty/c;", "EVENT", "STATE", "COMMAND", "Lty/b;", "Lty/a;", "Loq/i0;", "b", "(Lm2/r;I)V", "Lmu/b0;", "getState", "()Lmu/b0;", "state", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c<EVENT, STATE, COMMAND> extends b<EVENT, STATE, COMMAND>, a {
    void b(r rVar, int i15);

    b0<STATE> getState();
}
