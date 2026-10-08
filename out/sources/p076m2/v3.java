package p076m2;

import p071kotlin.Metadata;
import t2.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u00052\u00020\u0006:\u0001\u0012J/\u0010\t\u001a\u00020\u00002\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lm2/v3;", "Lt2/f;", "Lm2/z;", "", "Lm2/o6;", "Lm2/e0;", "Lm2/a0;", "key", "value", "n1", "(Lm2/z;Lm2/o6;)Lm2/v3;", "Lm2/v3$a;", "builder", "()Lm2/v3$a;", "T", "F", "(Lm2/z;)Ljava/lang/Object;", "currentValue", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface v3 extends f<z<Object>, o6<Object>>, e0, a0 {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lm2/v3$a;", "Lt2/f$a;", "Lm2/z;", "", "Lm2/o6;", "Lm2/v3;", "build", "()Lm2/v3;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a extends f.a<z<Object>, o6<Object>> {
        @Override // t2.f.a
        f<z<Object>, o6<Object>> build();
    }

    @Override // p076m2.a0
    default <T> T F(z<T> zVar) {
        return (T) f0.b(this, zVar);
    }

    @Override // t2.f
    f.a<z<Object>, o6<Object>> builder();

    v3 n1(z<Object> key, o6<Object> value);
}
