package yu;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lyu/p1;", "", "ElementKlass", "Element", "Lyu/n;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lmr/c;", "kClass", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lmr/c;Lkotlinx/serialization/KSerializer;)V", "", "f", "([Ljava/lang/Object;)I", "", "e", "([Ljava/lang/Object;)Ljava/util/Iterator;", "b", "Lmr/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p1<ElementKlass, Element extends ElementKlass> extends n<Element, Element[], ArrayList<Element>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mr.c<ElementKlass> kClass;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SerialDescriptor descriptor;

    public p1(mr.c<ElementKlass> cVar, KSerializer<Element> kSerializer) {
        super(kSerializer, null);
        this.kClass = cVar;
        this.descriptor = new d(kSerializer.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yu.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Iterator<Element> b(Element[] elementArr) {
        return fr.c.a(elementArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yu.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int c(Element[] elementArr) {
        return elementArr.length;
    }

    @Override // yu.n, kotlinx.serialization.KSerializer, uu.o
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }
}
