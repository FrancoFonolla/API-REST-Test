package com.utn.Proyect.Config;

import com.utn.Proyect.Entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {
    @Override
    public void newRevision(Object revisionEntity) {
        final Revision revision=(Revision) revisionEntity;
    }
}
