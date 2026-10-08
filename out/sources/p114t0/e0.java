package p114t0;

import fr.k;
import fr.t;
import java.util.Map;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118 X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0016¨\u0006\u0017"}, d2 = {"Lt0/e0;", "", "<init>", "()V", "exit", "c", "(Lt0/e0;)Lt0/e0;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "Lt0/e1;", "b", "()Lt0/e1;", "data", "a", "Lt0/f0;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e0 f186282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e0 f186283c;

    /* JADX INFO: renamed from: t0.e0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt0/e0$a;", "", "<init>", "()V", "Lt0/e0;", "None", "Lt0/e0;", "a", "()Lt0/e0;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final e0 a() {
            return e0.f186282b;
        }

        private Companion() {
        }
    }

    static {
        k kVar = null;
        Fade fade = null;
        Slide slide = null;
        ChangeSize changeSize = null;
        Scale scale = null;
        f1 f1Var = null;
        Map map = null;
        f186282b = new f0(new TransitionData(fade, slide, changeSize, scale, f1Var, false, map, CertificateBody.profileType, kVar));
        f186283c = new f0(new TransitionData(fade, slide, changeSize, scale, f1Var, true, map, 95, kVar));
    }

    public /* synthetic */ e0(k kVar) {
        this();
    }

    public abstract TransitionData b();

    public final e0 c(e0 exit) {
        Fade fade = exit.b().getFade();
        if (fade == null) {
            fade = b().getFade();
        }
        Slide slide = exit.b().getSlide();
        if (slide == null) {
            slide = b().getSlide();
        }
        ChangeSize changeSize = exit.b().getChangeSize();
        if (changeSize == null) {
            changeSize = b().getChangeSize();
        }
        Scale scale = exit.b().getScale();
        if (scale == null) {
            scale = b().getScale();
        }
        exit.b().g();
        b().g();
        return new f0(new TransitionData(fade, slide, changeSize, scale, null, exit.b().getHold() || b().getHold(), v0.o(b().b(), exit.b().b())));
    }

    public boolean equals(Object other) {
        return (other instanceof e0) && t.c(((e0) other).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (t.c(this, f186282b)) {
            return "ExitTransition.None";
        }
        if (t.c(this, f186283c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData transitionDataB = b();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("ExitTransition: \nFade - ");
        Fade fade = transitionDataB.getFade();
        sb5.append(fade != null ? fade.toString() : null);
        sb5.append(",\nSlide - ");
        Slide slide = transitionDataB.getSlide();
        sb5.append(slide != null ? slide.toString() : null);
        sb5.append(",\nShrink - ");
        ChangeSize changeSize = transitionDataB.getChangeSize();
        sb5.append(changeSize != null ? changeSize.toString() : null);
        sb5.append(",\nScale - ");
        Scale scale = transitionDataB.getScale();
        sb5.append(scale != null ? scale.toString() : null);
        sb5.append(",\nKeepUntilTransitionsFinished - ");
        sb5.append(transitionDataB.getHold());
        return sb5.toString();
    }

    private e0() {
    }
}
