package rn;

import fr.k;
import fv.c0;
import fv.e0;
import fv.x;
import java.lang.reflect.Type;
import kotlinx.serialization.KSerializer;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import uu.l;
import uu.o;
import uu.p;
import uu.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0001\u001c¨\u0006\u001d"}, d2 = {"Lrn/e;", "", "<init>", "()V", "T", "Luu/a;", "loader", "Lfv/e0;", "body", "a", "(Luu/a;Lfv/e0;)Ljava/lang/Object;", "Lfv/x;", CMSAttributeTableGenerator.CONTENT_TYPE, "Luu/o;", "saver", "value", "Lfv/c0;", "d", "(Lfv/x;Luu/o;Ljava/lang/Object;)Lfv/c0;", "Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", "c", "(Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "Luu/l;", "b", "()Luu/l;", "format", "Lrn/e$a;", "retrofit2-kotlinx-serialization-converter"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lrn/e$a;", "Lrn/e;", "Luu/s;", "format", "<init>", "(Luu/s;)V", "T", "Luu/a;", "loader", "Lfv/e0;", "body", "a", "(Luu/a;Lfv/e0;)Ljava/lang/Object;", "Lfv/x;", CMSAttributeTableGenerator.CONTENT_TYPE, "Luu/o;", "saver", "value", "Lfv/c0;", "d", "(Lfv/x;Luu/o;Ljava/lang/Object;)Lfv/c0;", "Luu/s;", "e", "()Luu/s;", "retrofit2-kotlinx-serialization-converter"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final s format;

        public a(s sVar) {
            super(null);
            this.format = sVar;
        }

        @Override // rn.e
        public <T> T a(uu.a<? extends T> loader, e0 body) {
            return (T) b().c(loader, body.C());
        }

        @Override // rn.e
        public <T> c0 d(x contentType, o<? super T> saver, T value) {
            return c0.c(contentType, b().a(saver, value));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // rn.e
        /* JADX INFO: renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
        public s b() {
            return this.format;
        }
    }

    public /* synthetic */ e(k kVar) {
        this();
    }

    public abstract <T> T a(uu.a<? extends T> loader, e0 body);

    protected abstract l b();

    public final KSerializer<Object> c(Type type) {
        return p.a(b().b(), type);
    }

    public abstract <T> c0 d(x contentType, o<? super T> saver, T value);

    private e() {
    }
}
