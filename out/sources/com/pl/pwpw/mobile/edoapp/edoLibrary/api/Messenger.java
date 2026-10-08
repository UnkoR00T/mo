package com.pl.pwpw.mobile.edoapp.edoLibrary.api;

import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.IMessage;
import er.l;
import fr.k;
import fr.q0;
import fr.t;
import fr.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mr.c;
import oq.i0;
import oq.r;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000b\u001a\u00020\t\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0003J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R:\u0010\u0015\u001a&\u0012\"\u0012 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b0\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/Messenger;", "", "<init>", "()V", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/IMessage;", "IType", "Lmr/c;", "type", "Lkotlin/Function1;", "Loq/i0;", "receiver", "Register", "(Lmr/c;Ler/l;)V", "Unregister", "(Ljava/lang/Object;)V", "UnregisterAll", "message", "Send", "(Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/IMessage;)V", "", "Loq/r;", "registry", "Ljava/util/List;", "Companion", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Messenger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static Messenger instance;
    private List<r<c<IMessage>, l<IMessage, i0>>> registry;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/Messenger$Companion;", "", "<init>", "()V", "instance", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/Messenger;", "Instance", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Messenger Instance() {
            if (Messenger.instance == null) {
                Messenger.instance = new Messenger(null);
            }
            return Messenger.instance;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Messenger(k kVar) {
        this();
    }

    public final <IType extends IMessage> void Register(c<IType> type, l<? super IType, i0> receiver) {
        this.registry.add(new r<>(type, (l) w0.g(receiver, 1)));
    }

    public final void Send(IMessage message) {
        List<r<c<IMessage>, l<IMessage, i0>>> list = this.registry;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (t.c(((r) obj).c(), q0.c(message.getClass()))) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l) ((r) it.next()).d()).b(message);
        }
    }

    public final void Unregister(Object receiver) {
        Object next;
        Iterator<T> it = this.registry.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.c(((r) next).d(), receiver));
        Iterator it4 = v.e(next).iterator();
        while (it4.hasNext()) {
            w0.a(this.registry).remove((r) it4.next());
        }
    }

    public final void UnregisterAll() {
        this.registry.clear();
    }

    private Messenger() {
        this.registry = new ArrayList(0);
    }
}
